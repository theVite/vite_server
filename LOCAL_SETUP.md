## Setup

### Gradle Setup

   Gradle is used to gather dependencies and build a fat jar for this project you can install and configure it using:
   
   - Note: `$ brew install gradle` is not needed if you already have a working version of gradle for this project. 
   - We are in the process of converting to Gradle 3.1. If you have any issues, Gradle 2.14 is recommended.
        
        $ brew install gradle
        
#### Notes about Gradle and brew:
   
   Vite Server can be built in Gradle 2.x or 3.1. To make sure you are safe moving forward, there is a way to switch 
   back and forth between gradle installations. First verify what gradle you have brew installed with the `brew info` 
   command. It should look something like this:
   
   ```
   $> brew info gradle
   gradle: stable 3.1
   Build system based on the Groovy language
   https://www.gradle.org/
   /usr/local/Cellar/gradle/2.14 (168 files, 49.7M) *
     Built from source on 2016-07-26 at 16:07:45
   From: https://github.com/Homebrew/homebrew-core/blob/master/Formula/gradle.rb
   ==> Requirements
   Required: java >= 1.7 ✔
   ```
   
   Next, upgrade your version of gradle. As you can see, the most recent stable version is 3.1, so we just need to 
   use the `brew upgrade` command, which should look like this:
   
   ```
   $> brew update gradle
   ==> Upgrading 1 outdated package, with result:
   gradle 3.1
   ==> Upgrading gradle
   ==> Using the sandbox
   ==> Downloading https://downloads.gradle.org/distributions/gradle-3.1-bin.zip
   ######################################################################## 100.0%homebrew/versions/gradle214
   🍺  /usr/local/Cellar/gradle/3.1: 174 files, 73M, built in 19 seconds
    sagesmith [vite_server] (master) $ brew info gradle
   gradle: stable 3.1
   Build system based on the Groovy language
   https://www.gradle.org/
   /usr/local/Cellar/gradle/2.14 (168 files, 49.7M)
     Built from source on 2016-07-26 at 16:07:45
   /usr/local/Cellar/gradle/3.1 (174 files, 73M) *
     Built from source on 2016-11-07 at 15:39:09
   From: https://github.com/Homebrew/homebrew-core/blob/master/Formula/gradle.rb
   ==> Requirements
   Required: java >= 1.7 ✔
   ```
   
   Now that you have gradle updated, you still technically have both gradles installed. To switch between them you 
   use the `brew switch` command like this:
   
   ```
   $> brew switch gradle 2.14
   Cleaning /usr/local/Cellar/gradle/2.14
   Cleaning /usr/local/Cellar/gradle/3.1
   1 links created for /usr/local/Cellar/gradle/2.14
   
   $> brew switch gradle 3.1
   Cleaning /usr/local/Cellar/gradle/2.14
   Cleaning /usr/local/Cellar/gradle/3.1
   1 links created for /usr/local/Cellar/gradle/3.1
   ```
   
   This will allow you to use both as we transfer, meaning that if something goes wrong with 3.1, you can revert back to 2.14 or whatever prior version you were using.

### Java Setup

#### Installing Java

        $ brew install java


#### Setting the default version
   The following lines should be added to your .profile in order to switch between Java environments

        $ export DEFAULT_JDK_VERSION=1.8
        $ export JAVA_HOME=$(/usr/libexec/java_home -F -v "$DEFAULT_JDK_VERSION")
        $ alias jdkDefault="export JAVA_HOME=$(/usr/libexec/java_home -F -v $DEFAULT_JDK_VERSION)"
        $ alias jdk8="export JAVA_HOME=$(/usr/libexec/java_Home -F -v 1.8)"

### Getting the Repo
1. Fork the repo
2. Clone your fork (`$ git clone git@github.com:<your username>/vite_serve.git`)
3. Build the project (`$ gradlew assemble`)
4. Run checks (`$ gradlew check`)
