# Spring Boot Docker Demo

This is a simple Spring Boot application demonstrating the use of Docker for containerization.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Building the Application](#building-the-application)
- [Running the Docker Image](#running-the-docker-image)


## Overview

This Spring Boot application provides a basic "Hello World" API endpoint. It includes a Dockerfile for containerization.

## Prerequisites

- [Java 21](https://openjdk.java.net/projects/jdk/21/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)

## Building the Application

To build the application, run the following Maven command:

```bash
mvn clean install
```

This will compile the code, run tests, and package the application into a JAR file.

## Running the Docker Image

To build and run the Docker image, use the following commands:

```bash
docker build -t spring-boot-docker-demo .
docker run -p 8080:8080 spring-boot-docker-demo
```

The application will be accessible at http://localhost:8080/api/docker/v1/hello-world.


