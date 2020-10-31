FROM java:8

ADD /target/ContainerCommunicationAPI-v1.jar ContainerCommunicationAPI-v1.jar


ENTRYPOINT ["java", "-jar", "ContainerCommunicationAPI-v1.jar"]

EXPOSE 8095