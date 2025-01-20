ARG RUNTIME_VERSION
FROM openjdk:${RUNTIME_VERSION}

ARG BUILD_PATH

WORKDIR /app
COPY ${BUILD_PATH}/*.jar ./app.jar
CMD ["sh", "-c", "java ${JAVA_OPTS:-} -jar ./app.jar"]
