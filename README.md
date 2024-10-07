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

As of not there is no automation to release this SDK so it is a manual proces... 

1. Make sure the proto module is pointing at the correct version of the module that is to be used, either a tag or the master branch.
1. Once you verified that the proto submodule is pointing to the right commit then run the `./prepare.sh` script, this will move the proto files to the right contents for each SDK
1. Run `./gradlew clean build` to generate and test that everything works fine
1. Run `./gradlew publish -x test` to publish the released artifacts