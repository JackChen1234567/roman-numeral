#!/bin/sh
while ! nc -z mysql-standalone 3306 ; do
    echo "Waiting for the mysql starting"
    sleep 5
done
java -jar roman-numeral.jar
