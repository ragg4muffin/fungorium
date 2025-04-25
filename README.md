# fungorium
Projlab 💀

# My Maven Project

This is a simple Maven project that demonstrates the structure and setup of a Java application using Maven.

## Project Structure

```
my-maven-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Maven installed on your machine.

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

This command will compile the source code, run the tests, and package the application.

## Running the Application

After building the project, you can run the application using the following command:

```
java -cp target/my-maven-project-1.0-SNAPSHOT.jar App
```

Make sure to replace `my-maven-project-1.0-SNAPSHOT.jar` with the actual name of the jar file generated in the `target` directory.

## Running Tests

To run the tests, use the following command:

```
mvn test
```

This will execute the test cases defined in `AppTest.java`.

## License

This project is licensed under the MIT License.