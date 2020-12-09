FROM ubuntu:latest

MAINTAINER DAB "dab@dab.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin/

ADD tech-app.jar .

# CMD ["/bin/bash"]

ENTRYPOINT ["java", "-jar", "tech-app.jar"]