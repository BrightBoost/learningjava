package com.pluralsight.week5.testexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTwoPositiveNumbers_expectPositiveResult() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.add(4, 4);

        // assert
        assertEquals(8.0, result);
    }

    @Test
    void subtractTwoPositiveNumbers_expectNoError() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.subtract(3, 1);

        // assert
        assertEquals(2, result);
    }

    @Test
    void multiplyTwoPositiveNumbers_expectPositiveOutcome() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.multiply(3, 4);

        // assert
        assertEquals(12, result);
    }
    @Test
    void divideTwoPositiveNumbers_expectPositiveOutcome() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.divide(3, 4);

        // assert
        assertEquals(0.75, result);
    }
    @Test
    void divideByZero_expectArithmeticException() {
        // arrange
        Calculator calculator = new Calculator();

        // act and assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}