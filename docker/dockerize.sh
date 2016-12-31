set -ex

NAME=thevite/vite_server
TAG=${1:-latest}

#./gradlew build
mv build/libs/vite-server-*.jar docker/vite-server.jar
docker build docker/ -t "${NAME}:${TAG}"
rm docker/$NAME.jar
