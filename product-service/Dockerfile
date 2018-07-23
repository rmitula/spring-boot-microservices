FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE="target/product-service-0.0.1-SNAPSHOT.jar"
COPY ${JAR_FILE} app.jar

COPY config-client-entrypoint.sh /config-client-entrypoint.sh
RUN chmod 755 /config-client-entrypoint.sh
ENTRYPOINT ["/config-client-entrypoint.sh"]