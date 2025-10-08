package com.pluralsight.week3;

import java.util.HashMap;
import java.util.Scanner;

public class MapsExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Zia", 1);
        nameAndAge.put("Cliff", 1);
        nameAndAge.put("Jonas", 7);
        nameAndAge.put("Gaia", 10);

        System.out.println("Whose age do you want to see?");
        for(String name : nameAndAge.keySet()) {
            System.out.println(name);
        }
        String chosenName = scanner.nextLine();

        Integer age = nameAndAge.get(chosenName);
        if(age != null) {
            System.out.println(chosenName + "'s age is " + age);
        } else {
            System.out.println("idk!");
        }



    }
}
