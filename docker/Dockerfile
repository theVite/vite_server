FROM openjdk:8

RUN mkdir /app
ADD vite_server.jar /app
ADD entrypoint.sh /
RUN chmod +x entrypoint.sh

EXPOSE 9000

CMD ["/entrypoint.sh"]
