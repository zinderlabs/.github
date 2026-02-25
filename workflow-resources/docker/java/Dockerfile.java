ARG RUNTIME_VERSION
FROM eclipse-temurin:${RUNTIME_VERSION}-ubi9-minimal

ARG BUILD_PATH

WORKDIR /app
COPY ${BUILD_PATH}/*.jar ./app.jar
CMD ["sh", "-c", "java ${JAVA_OPTS:-} -jar ./app.jar"]
