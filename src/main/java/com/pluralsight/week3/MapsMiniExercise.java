package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsMiniExercise {
    public static void main(String[] args) {
        /*
        ## 1) First contact: phone book (HashMap)
         */
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Thomas", "12345");
        phoneBook.put("Supreet", "23456");
        phoneBook.put("Mieraf", "34567");

        String nr = phoneBook.get("Thomas");
        if(nr != null) {
            System.out.println("Thomas nr is " + nr);
        }

        /*
        ## 2) Word → length dictionary
         */
        List<String> fruits = new ArrayList<>(List.of("banana", "apple", "grapefruit", "lemon"));
        Map<String, Integer> wordLengthMap = new HashMap<>();
        for(String fruit : fruits) {
            wordLengthMap.put(fruit, fruits.size());
        }
        Integer length = wordLengthMap.get("elephant");
        if(length != null) {
            System.out.println(length);
        } else {
            System.out.println("Not found");
        }
        /*
        ## 3) Bonus: Counting with a frequency map

        Given a list `["apple","pear","apple","banana","apple","pear"]`, build a frequency map `Map<String,Integer>`.
        **Tasks:**

        * Increment counts correctly.
        * Print: `apple=3, pear=2, banana=1`.
         */
        List<String> fruits2 = new ArrayList<>(List.of("banana", "apple", "grapefruit", "lemon", "apple"));
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String fruit : fruits2){
            frequencyMap.put(fruit, frequencyMap.get(fruit) != null ? frequencyMap.get(fruit) + 1 : 1);
        }
        System.out.println(frequencyMap);
    }
}
