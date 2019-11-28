FROM adoptopenjdk/openjdk11:alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/notification-service
ADD @project.build.finalName@.jar /usr/local/notification-service/
ADD run.sh run.sh
RUN sed -i 's/\r$//' run.sh
RUN chmod +x run.sh
CMD ./run.sh