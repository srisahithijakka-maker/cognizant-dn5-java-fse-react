# Exercise 2: Implementing Dependency Injection

## Objective

Implement Dependency Injection using Spring IoC and XML-based configuration.

## Implementation

- Configured `BookService` and `BookRepository` as Spring beans.
- Injected `BookRepository` into `BookService` using Setter Injection.
- Configured dependency injection using the `<property>` element in `applicationContext.xml`.
- Verified dependency injection by loading the Spring Application Context.

## Spring Concepts Used

- Inversion of Control (IoC)
- Dependency Injection (Setter Injection)
- XML Bean Configuration

## Output

The application successfully injects the `BookRepository` bean into `BookService` and executes the configured methods.
