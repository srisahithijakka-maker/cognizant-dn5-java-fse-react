# Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown

## Objective
Understand the Arrange-Act-Assert (AAA) testing pattern and use setup and teardown methods in JUnit.

## Scenario
This exercise demonstrates how to organize unit tests using the AAA pattern while initializing and cleaning up test resources with JUnit lifecycle methods.

## Implementation
- Created a Maven project named **JUnitAAA**.
- Added the JUnit 5 dependency.
- Created a `Calculator` class with a multiplication method.
- Created a `CalculatorTest` class.
- Used the Arrange-Act-Assert pattern inside the test.
- Used `@BeforeEach` to initialize the test fixture.
- Used `@AfterEach` to perform cleanup after execution.

## Concepts Used
- Arrange-Act-Assert (AAA)
- Test Fixtures
- `@BeforeEach`
- `@AfterEach`
- `assertEquals()`

## Output
The setup method executed before the test, the multiplication test passed successfully, and the teardown method executed after the test.

## Conclusion
This exercise demonstrates how to structure JUnit tests using the AAA pattern and lifecycle methods to improve readability, maintainability, and consistency of unit tests.
