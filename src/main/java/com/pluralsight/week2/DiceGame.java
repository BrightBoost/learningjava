package com.pluralsight.week2;

public class DiceGame {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int totalSeven = 0;
        int totalSix = 0;
        int totalFour = 0;
        int totalTwo = 0;

        for(int i = 0; i < 100000; i++) {
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();

            int total = roll1 + roll2;

            if(total == 7) {
                totalSeven++;
            } else if(total == 6) {
                totalSix++;
            } else if(total == 4) {
                totalFour++;
            } else if(total == 2) {
                totalTwo++;
            }
        }

        // not my best work
        System.out.printf("Nr of 7: %d\nNr of 6:%d\nNr of 4: %d\nNr of 2: %d\n", totalSeven, totalSix, totalFour, totalTwo);

    }
}
