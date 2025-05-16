# kotlin
Kotlin SDK for mica

Clone this repository recurse submodules so the proto definitions are cloned along with the code

```bash
git clone --recurse-submodules git@github.com:1080network/kotlin.git
```

## Pre Requisites

1. JVM 17 or later 
1. A github token with the proper permissions to write to the git package repository in [public](https://github.com/1080network/public)

## Manual release

As of not there is no automation to release this SDK so it is a manual process.

### One time setup

1. Create a personal access token with `write:packages` permission to 1080network org.
1. Create `publish.env` file (its gitignore'd) and add `GITHUB_USER=<your user>` and `GITHUB_TOKEN=<your token>` to it.

### Releasing

1. Make sure the proto module is pointing at the correct version of the module that is to be used, either a tag or the master branch.
1. `make version newVersion=vX.Y.Z` to update version locally
1. `make build` to copy protos over from submodule and generate Kotlin stubs
1. `make publish` to publish the released artifacts
2. Commit and push your version changes to main