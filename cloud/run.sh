#!/bin/sh

# set service name
SERVICE_NAME=sample

if [ -z "$ENVIRONMENT" ]; then
    echo "ENVIRONMENT is empty"
    exit 1
else
    echo "ENVIRONMENT is $ENVIRONMENT"
fi

exec java \
-jar \
-Dspring.profiles.active=$ENVIRONMENT \
/usr/opt/service/$SERVICE_NAME.jar