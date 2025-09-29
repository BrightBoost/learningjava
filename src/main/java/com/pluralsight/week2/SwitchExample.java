package com.pluralsight.week2;

import java.util.Scanner;

public class SwitchExample {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        switchStatementWithFewerBreakOnPurpose();

    }

    public static void switchStatementWithFewerBreakOnPurpose() {
        String day = getDay();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It's a weekday!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("Don't know that day");
        }
    }

    public static void switchStatementAlternative() {
       String day = getDay();

       switch (day) {
           case "Monday":
               System.out.println("I hate Mondays");
               break;
           case "Tuesday":
               System.out.println("Scientifically the most depressive day of the week");
               break;
           case "Wednesday":
               System.out.println("Hump day");
               break;
           case "Thursday":
               System.out.println("Almost Friday");
               break;
           case "Friday":
               System.out.println("Friday!");
               break;
           case "Saturday":
               System.out.println("Weekend still very long");
               break;
           case "Sunday":
               System.out.println("you can still do whatever, but...");
               break;
           default:
               System.out.println("I don't know that day...");
               break;
       }
    }

    public static void lengthyIfChain() {
        String day = getDay();

        if(day.equalsIgnoreCase("Monday")) {
            System.out.println("I hate Mondays");
        } else if(day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Scientifically the most depressive day of the week");
        } else if(day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Hump day");
        } else if(day.equalsIgnoreCase("Thursday")) {
            System.out.println("Almost Friday");
        } else if(day.equalsIgnoreCase("Friday")) {
            System.out.println("Friday!");
        } else if(day.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend still very long");
        } else if(day.equalsIgnoreCase("Sunday")) {
            System.out.println("you can still do whatever, but...");
        } else {
            System.out.println("I don't know that day");
        }
    }

    public static String getDay() {
        System.out.println("What day is it?");
        return scanner.nextLine();

    }
}
