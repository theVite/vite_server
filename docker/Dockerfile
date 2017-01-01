# AlpineLinux with a glibc-2.21 and Oracle Java 8

FROM anapsix/docker-alpine-java

# Set up vite jar
RUN mkdir /app
ADD vite_server.jar /app
ADD entrypoint.sh /
RUN chmod +x entrypoint.sh

EXPOSE 9000

CMD ["/entrypoint.sh"]
