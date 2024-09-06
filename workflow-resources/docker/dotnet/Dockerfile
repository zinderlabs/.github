ARG BUILD_PATH

WORKDIR /app
COPY --from=publish /${BUILD_PATH} .
ENTRYPOINT ["dotnet", "*.dll"]
