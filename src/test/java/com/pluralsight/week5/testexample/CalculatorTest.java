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
}