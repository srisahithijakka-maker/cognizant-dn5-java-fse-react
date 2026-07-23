package com.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator();
    }

    @Test
    void testMultiply() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);

    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...");
    }
}