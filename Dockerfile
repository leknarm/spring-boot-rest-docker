FROM anapsix/alpine-java:8_server-jre

ADD target/*.jar /opt/
CMD ["java", "-jar", "/opt/spring-boot-rest-docker-0.0.1-SNAPSHOT.jar"]
