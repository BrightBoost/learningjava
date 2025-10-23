package com.pluralsight.week5.staticexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void testCatCounter() {
        // arrange
        int expectedCatCount = 2;

        // act
        Cat c1 = new Cat("Leo");
        Cat c2 = new Cat("Mimi");

        // assert
        assertEquals(expectedCatCount, Cat.catCount);
    }
}