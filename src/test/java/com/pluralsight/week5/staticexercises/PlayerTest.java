package com.pluralsight.week5.staticexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testAlteringGamesettings() {
        // arrange
        Player p1 = new Player();
        int expectedLevel = 10;

        // act
        p1.getGameSettings().changeVolumeLevel(10);

        // assert
        assertEquals(expectedLevel, GameSettings.volumeLevel);
    }

}