package com.pluralsight.week1;

public class MethodMiniExercises {
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Mieraf");
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
}
