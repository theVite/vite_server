set -ex

NAME=thevite/vite_server
TAG=${1:-latest}

mv build/libs/vite-server-*.jar docker/vite-server.jar
docker build docker/ -t "${NAME}:${TAG}"
rm docker/vite-server.jar
