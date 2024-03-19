FROM openjdk:21-jdk
VOLUME /tmp
EXPOSE 8080
EXPOSE 80
ADD target/helloimg-0.0.1-SNAPSHOT.jar helloimg.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/helloimg.jar"]







