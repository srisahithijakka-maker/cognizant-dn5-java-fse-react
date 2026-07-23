# Exercise 3: Assertions in JUnit

## Objective
Use different JUnit assertions to verify expected results in unit tests.

## Scenario
This exercise demonstrates how various JUnit assertion methods can be used to validate conditions, compare expected values, and check object references during testing.

## Implementation
- Created a Maven project named **JUnitAssertions**.
- Added the JUnit 5 dependency in `pom.xml`.
- Created the `AssertionsTest` class under `src/test/java`.
- Implemented the following JUnit assertions:
  - `assertEquals()`
  - `assertTrue()`
  - `assertFalse()`
  - `assertNull()`
  - `assertNotNull()`
- Executed the test successfully.

## Assertions Used
- **assertEquals()** – Verifies that two values are equal.
- **assertTrue()** – Verifies that a condition is true.
- **assertFalse()** – Verifies that a condition is false.
- **assertNull()** – Verifies that an object is null.
- **assertNotNull()** – Verifies that an object is not null.

## Output
All assertions executed successfully, and the test passed without any failures.

## Conclusion
This exercise demonstrates the use of different JUnit assertions for validating program behavior. Assertions help ensure that the actual output matches the expected result, making unit testing more reliable and effective.
