package com.pluralsight.week2;

import java.util.Arrays;

public class MoreArrayStuff {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue"};
        String[] copy = new String[3];
        copy = colors;

        for (String color : colors) {
            System.out.println(color);
        }
        for (int i = 0; i < colors.length; i++) {
            colors[i] = "dark " + colors[i];
        }
        for (String c : copy) {
            System.out.println(c);
        }
    }

    public static void copyCode() {
        String[] colors = {"red", "white", "blue"};
        String[] colorCopy = new String[3];
        // copy colors to colorCopy 1 at a time
        for (int i = 0; i < 3; i++) {
            colorCopy[i] = colors[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy[i]);
        }
        Arrays.sort(colorCopy);
        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i] + " : " + colorCopy[i]);
        }
    }
}
