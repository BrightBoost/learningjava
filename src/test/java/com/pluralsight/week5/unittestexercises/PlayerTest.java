package com.pluralsight.week5.unittestexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;

    @BeforeEach
    void init() {
        player = new Player("Jonas");
    }

    @Test
    void getNameWorks() {
        // arrange
        String expectedName = "Jonas";

        // act
        String actualName = player.getName();

        // assert
        assertEquals(expectedName, actualName);
    }

    @Test
    void newPlayer_scoreZero() {
        // arrange
        int expectedZeroScore = 0;

        // act
        int actualScore = player.getScore();

        // assert
        assertEquals(expectedZeroScore, actualScore);
    }

    @Test
    void addPoints_correctlyIncreasesScore() {
        // arrange
        int expectedPoints = 2;

        // act
        player.addPoints(2);

        // assert
        int actualPoints =  player.getScore();
        assertEquals(expectedPoints, actualPoints);
    }


}