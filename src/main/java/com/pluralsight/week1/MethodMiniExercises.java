package com.pluralsight.week1;

public class MethodMiniExercises {
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Mieraf");
        String playerTitle = getPlayerTitle("Mieraf");
        System.out.println(playerTitle);
        boolean leveledUp = hasLeveledUp(50, 60);
        if(leveledUp) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding....");
        }
        boolean defeatedBoss = isBossDefeated(151, 200, true);
        System.out.println(defeatedBoss);
    }

    /*
    ### 1. public static void printWelcome()
     */

    public static void printWelcome() {
        System.out.println("Welcome to Code Quest!");
    }

    /*
    ### 2. public static void displayPlayerName(String playerName)
     */

    public static void displayPlayerName(String playerName) {
        System.out.println("Player joined: " + playerName);
    }

    /*
    From second file
    ### **1. public static String getPlayerTitle(String name)**

     */

    public static String getPlayerTitle(String name) {
        // you could have more code here
        // for example print something
        return "Princess " + name;
    }

    /*
    ### **3. public static boolean hasLeveledUp(int currentXP, int threshold)**

     */
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        if(currentXP >= threshold) {
            return true;
        } else {
            return false;
        }
    }

    /*
    ### **10. public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion)**
     */
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if(bossHP <= 0) {
            return true;
        } else if(playerHP <= 0 && !usedPotion) {
            return false;
        } else if(usedPotion) {
            return playerHP + 50 > bossHP;
        } else {
            return false;
        }
    }
}
