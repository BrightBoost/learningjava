package com.pluralsight.week2;

public class ArraysExplained {


    public static void displayNumbers(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] names = {"Najib", "Jenver", "Henok", "Ermiyas", "Nicolas"};
        // if we need to alter the array, we need to work with the index
        // so we need the regular for loop
        for(int i = 0; i < names.length; i ++) {
            names[i] = "Birkti is doing great!";
            System.out.println(names[i]);
        }

        // the for each loop cannot alter the elements in the array
        // you can just do things with it
        // just run through the array
        for(String name : names) {
            System.out.println(name);
            name = name + "!!!!!!!";
            System.out.println(name);
        }
        for(String name : names) {
            System.out.println(name);
        }

        displayNumbers(new int[]{63, 65, 60, 53, 58, 37, 35, 31});

    }
}
