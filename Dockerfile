FROM openjdk:8-jre-slim
WORKDIR /cursosonline_devops
COPY target/*.war /cursosonline_devops/cursosonline_devops-0.0.1-SNAPSHOT.war
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar cursosonline_devops-0.0.1-SNAPSHOT.war 



