# docker-compose test

## build and copy artifact to Docker dir

```
$ ./gradlew installDist
```

## run docker-compose

```
$ docker-compose up
```

## create user in Mongo

```
docker exec -it dockercomposetest_mongo_1 mongo
```

then execute scripts from mongo.txt