
.PHONY: proto
proto:
	./prepare.sh

.PHONY: version
version:
	./gradlew updateVersion -PnewVersion=$(newVersion)

.PHONY: build
build: proto
	./gradlew clean build

.PHONY: publish
publish:
	set -o allexport; source ./publish.env; set +o allexport; ./gradlew publish