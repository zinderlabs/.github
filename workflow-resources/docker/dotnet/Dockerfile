ARG RUNTIME_VERSION
ARG BUILD_PATH

FROM mcr.microsoft.com/dotnet/sdk:${RUNTIME_VERSION}
WORKDIR /app
COPY /${BUILD_PATH} .
ENTRYPOINT ["dotnet", "*.dll"]
