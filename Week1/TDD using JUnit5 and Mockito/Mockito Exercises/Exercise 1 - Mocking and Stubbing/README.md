# Exercise 1 - Mocking and Stubbing

## Objective
Learn how to use Mockito to create mock objects and stub method responses while testing a service.

## What was implemented
- Created an `ExternalApi` interface.
- Created a `MyService` class that depends on `ExternalApi`.
- Used Mockito to create a mock object.
- Stubbed the `getData()` method to return predefined data.
- Verified the returned value using a JUnit assertion.

## Technologies Used
- Java
- Maven
- JUnit 5
- Mockito

## Output
The test executed successfully and passed.

## Conclusion
This exercise demonstrates how Mockito can replace external dependencies with mock objects, making unit tests simple, fast, and independent of real external services.
