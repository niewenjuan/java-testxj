FROM 100.125.0.87:20202/cpe/dockerhub-java:8-jre-alpine
WORKDIR /home/apps/
ADD target/java-testxj-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
