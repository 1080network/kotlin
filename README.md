# Kotlin

Kotlin SDK for mica

## Cloning this repo

This repository uses a git submodule to get the proto definition code. You can clone with the following command to get the submodule initialized 

```bash
git clone --recurse-submodules git@github.com:1080network/kotlin.git
```

## Pre Requisites

1. JVM 17 or later 
2. A github token with the proper permissions to write to the git package repository in [public](https://github.com/1080network/public)

## Manual release

As of now there is no automation to release this SDK so it is a manual process.

### One time setup

1. Create a personal access token with `write:packages` permission to 1080network org.
2. Create `publish.env` file (its gitignore'd) and add `GITHUB_USER=<your user>` and `GITHUB_TOKEN=<your token>` to it.

### Releasing

1. Set VERSION environment variable: `export VERSION=vX.Y.Z` (`VERSION` is whatever the protos tag is from which this SDK is getting released)
2. `git checkout -b $VERSION`
3. `make all` to build the new SDK
4. Create PR with changes, get approval, merge into main
5. `make publish` to publish the released artifacts
6. Verify that the new build is available [here](https://github.com/orgs/1080network/packages?ecosystem=maven).
