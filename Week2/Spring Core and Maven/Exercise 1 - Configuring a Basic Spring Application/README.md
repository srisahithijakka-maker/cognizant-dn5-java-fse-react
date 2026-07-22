# Exercise 1: Configuring a Basic Spring Application

## Objective
Configure a basic Spring application using XML-based configuration and Maven.

## Implementation
- Created a Maven project named **LibraryManagement**.
- Added Spring Core and Spring Context dependencies in `pom.xml`.
- Created `BookService` and `BookRepository` classes.
- Configured both classes as Spring beans in `applicationContext.xml`.
- Loaded the Spring Application Context using `ClassPathXmlApplicationContext`.
- Retrieved the `BookService` bean and verified the configuration by running the application.

## Output
The application starts successfully and displays:
Hello World!
Inside BookService
Inside BookRepository

## Conclusion
This exercise demonstrates the basic setup of a Spring application using XML-based bean configuration and the Spring IoC container.
