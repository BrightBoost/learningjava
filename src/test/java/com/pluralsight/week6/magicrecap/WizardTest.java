package com.pluralsight.week6.magicrecap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void castSpell() {
        // arrange
        Wizard wizard = new Wizard("Ron", "Gryffindor", 100, "broken");
        String expectedResult = "Ron from Gryffindor casts alohomora";

        // act
        String result = wizard.castSpell("alohomora");

        // assert
        assertEquals(expectedResult, result);

    }
}