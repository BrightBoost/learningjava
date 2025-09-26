package com.pluralsight.week1;

public class MethodMiniExercises {
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Mieraf");
        String playerTitle = getPlayerTitle("Mieraf");
        System.out.println(playerTitle);
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
> Return a string like:
`"Lord " + name` or `"Princess " + name"`
→ Call it in `main()` and print the result.
     */

    public static String getPlayerTitle(String name) {
        // you could have more code here
        // for example print something
        return "Princess " + name;
    }
}
