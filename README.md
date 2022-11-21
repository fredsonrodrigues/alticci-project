# alticci-project Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .


## Prerequisite

- Java 17
- `$JAVA_HOME` env defined.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Running the application with docker
Obviously, you must have Docker installed.

On Linux or Mac use:
```shell script
# Starting the container
make deploy-docker

# if you don't have installed Make:
./scripts/deploy-docker

# for stop the container, use
make remove-docker

# or
./scripts/remove-docker

```
On Windows, use:
```shell script
# deploy the container
scripts\deploy-docker.cmd

# stop the container
scripts\remove-docker.cmd
```

## Access the application

- Swagger: [/q/swagger-ui](http://localhost:8080/q/swagger-ui/)
- Open Api file: [/q/openapi](http://localhost:8080/q/openapi)


## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```

## Related Guides


## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
