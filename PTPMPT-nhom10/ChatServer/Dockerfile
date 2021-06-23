FROM openjdk:11.0.9.1
COPY /src src
WORKDIR src
RUN javac chatserver/ChatServer.java
EXPOSE 9999
CMD ["java", "chatserver.ChatServer"]
