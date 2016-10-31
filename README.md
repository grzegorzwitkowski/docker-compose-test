# docker-compose test

## build and copy artifact to Docker dir

```
$ ./gradlew installDist
```

## run docker-compose

```
$ docker-compose up -d
```

## setup Mongo (one time action)

```
docker exec -it mongo mongo docker_compose_test setup/mongo.js
```

## call api

```
$ curl http://localhost:8080/users
```

## stop containers

```
$ docker-compose down
```

## stop containers and remove images

```
$ docker-compose down --rmi all
```

## force build images at startup

```
$ docker-compose up --build
```
