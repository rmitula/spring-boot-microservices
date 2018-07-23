#!/bin/sh

while ! nc -z config-service 8888 ; do
    echo "Waiting for upcoming config-service server"
    sleep 2
done

java -Djava.security.egd=file:/dev/./urandom -jar app.jar