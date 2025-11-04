package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.List;

public class ListExplained {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C#");
        languages.add("JavaScript");
//        languages.remove("Java");
//        languages.remove(0);

        System.out.println(languages.get(1)); // languages[1] for arrays and python

        for(String language : languages) {
            System.out.println(language);
        }

        // adjusting values possible here (not in for each)
        for(int i = 0; i < languages.size(); i++) {
            languages.set(i, languages.get(i) + " is fun!");
            System.out.println(languages.get(i));
        }

        List<String> test = new ArrayList<>(List.of("bla", "bla"));
        test.add("bla");



    }
}
