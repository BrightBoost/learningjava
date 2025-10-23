package com.pluralsight.week5;

import com.pluralsight.week5.staticexercises.NameFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    void formatTwoParameters() {
        // arrange
        String firstName = "Mel";
        String lastName = "Johnson";
        String expectedFormat = "Johnson, Mel";

        // act
        String actualFormat = NameFormatter.format(firstName, lastName);

        // assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatFiveParameters() {
        // arrange
        String firstName = "Mel";
        String lastName = "Johnson";
        String middleName = "B";
        String prefix = "Dr.";
        String suffix = "PhD";
        String expectedFormat = "Johnson, Dr. Mel B, PhD";

        // act
        String actualFormat = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert
        assertEquals(expectedFormat, actualFormat);
    }


    @Test
    void formatFullnameFourNameParts() {
        // arrange
        String name = "Mel B Johnson, PhD";
        String expectedFormat = "Johnson, Dr. Mel B, PhD";

        // act
        String actualFormat = NameFormatter.format(name);

        // assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatFullnameFiveNameParts() {
        // arrange
        String name = "Dr. Mel B Johnson, PhD";
        String expectedFormat = "Johnson, Dr. Mel B, PhD";

        // act
        String actualFormat = NameFormatter.format(name);

        // assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatFullnameTwoNameParts() {
        // arrange
        String name = "Mel Johnson";
        String expectedFormat = "Johnson, Mel";

        // act
        String actualFormat = NameFormatter.format(name);

        // assert
        assertEquals(expectedFormat, actualFormat);
    }

    @Test
    void formatFullnameInvalidName() {
        // arrange
        String name = "Mel Johnson, PHD";

        // act
        String actualFormat = NameFormatter.format(name);

        // assert
        assertNull(actualFormat);
    }


}