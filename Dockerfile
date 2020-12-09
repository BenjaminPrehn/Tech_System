FROM ubuntu:latest

MAINTAINER DAB "dab@dab.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://tech-exam-test.ciwqxqldilky.us-east-1.rds.amazonaws.com:5432/postgres
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=Vedikke09!

WORKDIR /usr/local/bin/

ADD target/tech-app.jar .

# CMD ["/bin/bash"]

ENTRYPOINT ["java", "-jar", "tech-app.jar"]