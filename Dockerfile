FROM java:8

EXPOSE 8092

ADD /target/SpringDockerGitApp-0.0.1-SNAPSHOT.jar  SpringDockerGitApp-0.0.1-SNAPSHOT.jar 


ENTRYPOINT ["java", "-jar", "SpringDockerGitApp-0.0.1-SNAPSHOT.jar"]