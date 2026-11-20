# Mica SDK for Kotlin and Java

JVM client libraries for the [Mica](https://mica.io) network. Mica's API is [gRPC](https://grpc.io) over mutual TLS;
the messages and clients in this repository are generated from the
[public protos](https://github.com/1080network/proto). The same artifacts serve **Kotlin** (coroutine stubs and
Kotlin DSL builders) and **Java** (standard gRPC stubs): Java projects use them directly, there is no separate Java SDK.

## Which artifact do I need?

Each role is its own artifact, so you only depend on the code for the roles you play. Group `io.mica.sdk.kotlin`:

| Artifact | Use it if you are |
| --- | --- |
| `issuer` | an issuer |
| `acceptor` | an acceptor |
| `common` | everyone: shared messages and the `MicaChannels` helper. Pulled in automatically by `issuer` and `acceptor` |

Requires Java 11 or later. Versions match the proto release (proto `v2.0.0-pre0` is published as `2.0.0-pre0`).

## Installing

The artifacts are published to the [GitHub Packages Maven registry](https://github.com/orgs/1080network/packages?ecosystem=maven).
GitHub requires authentication to read from it, even for public packages: create a personal access token with the
`read:packages` scope.

### Gradle

```kotlin
repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/1080network/public")
        credentials {
            username = providers.gradleProperty("github.user").orNull ?: System.getenv("GITHUB_USER")
            password = providers.gradleProperty("github.token").orNull ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation("io.mica.sdk.kotlin:issuer:2.0.0-pre0") // or acceptor
}
```

### Maven

Add the registry and your credentials to `~/.m2/settings.xml`:

```xml
<settings>
  <servers>
    <server>
      <id>mica</id>
      <username>YOUR_GITHUB_USER</username>
      <password>YOUR_TOKEN</password>
    </server>
  </servers>
</settings>
```

then to your `pom.xml`:

```xml
<repositories>
  <repository>
    <id>mica</id>
    <url>https://maven.pkg.github.com/1080network/public</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>io.mica.sdk.kotlin</groupId>
    <artifactId>issuer</artifactId> <!-- or acceptor -->
    <version>2.0.0-pre0</version>
  </dependency>
</dependencies>
```

## Connecting

Mica uses mutual TLS. You need the root CA, and the client certificate and key Mica issued to you. The key must be
PKCS#8 PEM (`-----BEGIN PRIVATE KEY-----`); convert a traditional key with
`openssl pkcs8 -topk8 -nocrypt -in key.pem -out key.pk8.pem`.

Kotlin:

```kotlin
val credentials = MtlsCredentials.fromFiles(File("rootca.crt"), File("client.crt"), File("key.pk8.pem"))
val channel = MicaChannels.mtls("api.example.mica.io:443", credentials)

val ping = PingServiceGrpcKt.PingServiceCoroutineStub(channel).ping(pingRequest {})
```

Java:

```java
MtlsCredentials credentials = MtlsCredentials.fromFiles(new File("rootca.crt"), new File("client.crt"), new File("key.pk8.pem"));
ManagedChannel channel = MicaChannels.mtls("api.example.mica.io:443", credentials);

PingResponse ping = PingServiceGrpc.newBlockingStub(channel).ping(PingRequest.getDefaultInstance());
```

The generated clients are in packages such as `io.mica.issuer.service.v2` and `io.mica.member.ping.v1`.

`examples/` has a complete program that connects and calls `Ping`, a good first check that your certificates and network
path work:

```bash
./gradlew :examples:run --args="api.example.mica.io:443 rootca.crt client.crt key.pk8.pem"
```

## Repository layout

| Path | Contents |
| --- | --- |
| `common/`, `issuer/`, `acceptor/` | one Gradle module each; `src/generated` is **generated**, `src/main` is hand-written |
| `common/src/main/kotlin/io/mica/sdk` | `MicaChannels` and `MtlsCredentials`, the mutual TLS channel helper |
| `examples/` | runnable examples (not published) |
| `scripts/update-from-proto.sh` | regenerates the SDK for a proto release |

## Releasing (maintainers)

1. Run the **Generate SDKs** workflow in [1080network/proto](https://github.com/1080network/proto/actions) for the release tag.
2. Download its output: `gh run download <run-id> -R 1080network/proto -n generated-sdks-<version>`.
3. Run `scripts/update-from-proto.sh <version> <download-dir>`. It lays the generated code into the modules, sets the version, and runs the build and tests.
4. Open a pull request with the changes and merge it.
5. Create a GitHub token with `write:packages`, put `GITHUB_USER` and `GITHUB_TOKEN` in `publish.env` (git-ignored), then from the merged `main`:
   `set -a; source publish.env; set +a; ./gradlew publish`
6. Verify the new version appears in the [packages list](https://github.com/orgs/1080network/packages?ecosystem=maven).
