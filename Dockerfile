FROM alpine:latest
RUN apk add --no-cache openjdk8
VOLUME /tmp
RUN apk --no-cache add netcat-openbsd
ADD target/roman-numeral-1.0.jar roman-numeral.jar
COPY EntryPoint.sh /opt/bin/EntryPoint.sh
RUN chmod 755 /opt/bin/EntryPoint.sh
ENTRYPOINT ["java","-jar","/roman-numeral.jar"]
