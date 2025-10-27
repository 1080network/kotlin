ifndef VERSION
    $(error VERSION is not set)
endif

.PHONY: all
all: protoupdate version build

.PHONY: proto
proto:
	./prepare.sh

.PHONY: version
version:
	./gradlew updateVersion -PnewVersion=$(VERSION)

.PHONY: build
build: proto
        # copy protos over from submodule and generate Kotlin stubs
	./gradlew clean build

.PHONY: protoupdate
protoupdate:
	cd proto && git fetch --tags && git checkout $(VERSION)

.PHONY: publish
publish:
	set -o allexport; source ./publish.env; set +o allexport; ./gradlew publish
