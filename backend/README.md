# backend

> A Kotlin/Spring project

## Build Setup

``` bash
# build
gradle build

# run
gradle bootRun

# build Docker image
gradle docker

```

## API Documentation

``` bash
[[server-origin]]/swagger-ui.html
(ie. : http://localhost:8080/swagger-ui.html in dev)
```

## Mongo stack

[Kmongo](http://litote.org/kmongo/) was prefered to [Spring Data mongo](http://projects.spring.io/spring-data-mongodb/) because it's Kotlin oriented 

## Setup local Mongo env

### Full Docker-Compose

TODO

### Manual setup

#### init db and dev user

* `docker volume create --name lunchplace-mongo`
* `docker run -d --name mongo-lunchplace -v lunchplace-mongo:/data/db mongo --auth`
* `docker exec -ti mongo-lunchplace bash`
* `mongo admin`
* `db.createUser({ user: 'lunchplace', pwd: 'rulez', roles: [ { role: "root", db: "admin" } ] });`
* exit (the mongo shell)
* exit (the container)

#### test dev container

* `docker run -ti --rm --link mongo-lunchplace:mongo-lunchplace mongo:3.2 bash`
* `mongo -u lunchplace -p rulez --authenticationDatabase admin --host mongo-lunchplace lunchplace-dev`
* hack hack hack
* exit (the mongo shell)
* exit (the container)

#### stop the container when dev is finished

* `docker stop mongo-lunchplace`

#### start the container

* `docker start mongo-lunchplace`