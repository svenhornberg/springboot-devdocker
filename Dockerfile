FROM jamesdbloom/docker-java8-maven

WORKDIR /app
CMD mvn install
ENTRYPOINT mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000"
