package com.pluralsight.week5.unittestexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombatManagerTest {

    @Test
    void getTurnOrder() {
        // arrange
        CombatManager combatManager = new CombatManager();
        combatManager.addFighter("D", 5);
        combatManager.addFighter("C", 3);
        combatManager.addFighter("B", 2);
        combatManager.addFighter("E", 9);
        combatManager.addFighter("F", 11);
        combatManager.addFighter("A", 1);
        String[] expectedTurnOrder = {"F", "E", "D", "C", "B", "A"};

        // act
        String[] names = combatManager.getTurnOrder();

        // assert
        assertArrayEquals(expectedTurnOrder, names);
    }
}