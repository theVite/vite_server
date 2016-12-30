FROM openjdk:8

#VOLUME ["/app"]

RUN mkdir /app
ADD vite-server.jar /app
ADD entrypoint.sh /
RUN chmod +x entrypoint.sh

EXPOSE 9000

CMD ["/entrypoint.sh"]
