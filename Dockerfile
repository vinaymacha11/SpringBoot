FROM java:jdk-1.8
MAINTAINER Vinay Macha is the author
COPY target/EemployeeManagement-0.0.1-SNAPSHOT.jar  /app/
WORKDIR /app/
ENTRYPOINT [ "java","-jar","EemployeeManagement-0.0.1-SNAPSHOT.jar" ]