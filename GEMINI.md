# Groovy Web Server

This is a simple web server built with Groovy and Ratpack.

## Building and Running

To build the project, run the following command:

```bash
./gradlew build
```

To run the application, use the following command:

```bash
./gradlew run
```

Alternatively, you can run the main class directly:

```bash
groovy src/main/groovy/com/example/Main.groovy
```

The server will start on port 5050. You can access it at http://localhost:5050.

## Project Structure

*   `build.gradle`: The build script for the project. It uses Gradle to manage dependencies and build the project.
*   `gradlew`: The Gradle wrapper script. This allows you to run Gradle without having to install it on your system.
*   `src/main/groovy/com/example/Main.groovy`: The main application file. It uses the Ratpack framework to create a simple web server.
*   `src/main/resources/templates/index.html`: The HTML template for the home page. It uses Bootstrap for styling.

## Development Conventions

*   The project uses Groovy as the main programming language.
*   It uses Gradle for dependency management and building.
*   The web framework is Ratpack.
*   The frontend uses Bootstrap for styling.
*   The main class is `com.example.Main`.
