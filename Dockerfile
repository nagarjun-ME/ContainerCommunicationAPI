FROM java:8

EXPOSE 8092

ADD /target/ContainerCommunicationAPI-0.0.1-SNAPSHOT.jar ContainerCommunicationAPI-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar", "ContainerCommunicationAPI-0.0.1-SNAPSHOT.jar"]