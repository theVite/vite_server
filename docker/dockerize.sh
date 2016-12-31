set -ex

NAME=thevite/vite_server
TAG=${1:-latest}

#./gradlew build
mv build/libs/$NAME-*.jar docker/$NAME.jar
docker build docker/ -t "${NAME}:${TAG}"
rm docker/$NAME.jar
