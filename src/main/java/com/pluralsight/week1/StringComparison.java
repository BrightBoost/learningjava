package com.pluralsight.week1;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";

        if(s1.equals(s2)) {
            System.out.println("Same string!");
        } else if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Same text, different casing");
        } else {
            System.out.println("Not the same text");
        }

    }
}
