package com.pluralsight.week2.exercisecalcwithmethods;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
        displayMenu();
    }

    public static void displayMenu() {
        String menu = """
                === MENU ===
                1. Coffee - 3.99
                2. Tea - 2.99
                3. Cookie - 1.99
                """; // multiline string
        System.out.println(menu);
    }
}
