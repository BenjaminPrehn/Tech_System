FROM ubuntu:latest

MAINTAINER DAB "dab@dab.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

ENV version=${BUILD_NUMBER}
ENV environment=Production
ENV database=Postgres-aws-db-usage

ENV dbuser=postgres
ENV dbpass=Vedikke09!
ENV jdbcurl=jdbc:postgresql://tech-exam-test.ciwqxqldilky.us-east-1.rds.amazonaws.com:5432/postgres

WORKDIR /usr/local/bin/

ADD tech-app.jar .

# CMD ["/bin/bash"]

ENTRYPOINT ["java", "-jar", "tech-app.jar"]