FROM openjdk:13

# set service name
ENV SERVICE_NAME sample-service

# copy file to the working directory of container
ADD cloud/run.sh run.sh

# create app directory on container
RUN mkdir -p /usr/opt/service

# copy jar to the container
COPY ./$SERVICE_NAME/target/$SERVICE_NAME*.jar /usr/opt/service/$SERVICE_NAME.jar

# expose the port 8080
EXPOSE 8080

# what should be run when the container is created
ENTRYPOINT ["sh", "./run.sh"]