package com.pluralsight.week5.staticexercises;

public class NameFormatter {
    public static String format(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s, %s %s %s, %s", lastName, prefix, firstName, middleName, suffix);
    }

    public static String format(String fullName) {
        String[] nameParts = fullName.replace(",", "").split(" ");
        if(nameParts.length == 5) {
            return String.format("%s, %s %s %s, %s", nameParts[3], nameParts[0], nameParts[1], nameParts[2], nameParts[4]);
        } else if(nameParts.length == 4) {
            return String.format("%s, %s %s, %s", nameParts[2], nameParts[0], nameParts[1], nameParts[3]);
        } else if(nameParts.length == 2) {
            return String.format("%s, %s", nameParts[1], nameParts[0]);
        }
        return null;

    }
}
