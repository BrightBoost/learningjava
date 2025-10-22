package com.pluralsight.week5.unittestexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {
    private Battle battle;

    @BeforeEach
    void init() {
        battle = new Battle("Attacker1", 100, "Defender1", 100);
    }

    @Test
    public void testBattleStartsWithCorrectHPValues() {
        // arrange
        int correctHPvalue = 100;

        // act
        // no act

        // assert
        assertEquals(correctHPvalue, battle.getAttackerHp());
        assertEquals(correctHPvalue, battle.getDefenderHp());
    }

}