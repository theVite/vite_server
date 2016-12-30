NAME=vite-server
TAG=$1

./gradlew build
mv build/libs/$NAME-*.jar docker/$NAME.jar
docker build docker/ -t theVite/vite-server:$TAG
