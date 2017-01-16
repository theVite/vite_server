## Running the Project

### Build the source code

There are two ways to compile and check the code. The recommended way is:

- Run the checks `$ gradlew check`
- Assemble the code `$ gradlew assemble`

If you want two do both commands simultaneously however you can run:

        $ gradlew build

### Run the code

There are three ways to run the project. After building the project:
 
1. `$ java -jar build/libs/vit_server-0.0.0.SNAPSHOT.jar` probably the most straight forward
2. `$ gradlew bootRun` for gradlew fanatics
3. Configure your ide to run the code using `Application.java`