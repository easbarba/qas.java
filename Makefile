deps:
	./mvnw dependency:copy-dependencies

test:
	./mvnw test

build:
	./mvnw verify

run: build
	java -jar target/zae-${ZAE_VERSION}.jar

image:
	podman build --build-arg ZAE_VERSION=$$(cat .version) -t zae:${ZAE_VERSION} -f d./Dockerfile
