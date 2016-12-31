set -ex

# Docker Variables
NAME=vite_server
USER=thevite
DOCKER_NAME="${USER}/${NAME}"
TAG=${1:-latest}

mv "build/libs/${NAME}-*.jar" "docker/${NAME}.jar"
docker build docker/ -t "${DOCKER_NAME}:${TAG}"
rm "docker/${NAME}.jar"
