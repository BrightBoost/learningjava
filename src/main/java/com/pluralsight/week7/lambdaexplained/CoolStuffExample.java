package com.pluralsight.week7.lambdaexplained;

import java.util.ArrayList;
import java.util.List;

public class CoolStuffExample {
    public static void main(String[] args) {
        List<String> javaTopics = new ArrayList<>();
        javaTopics.add("class");
        javaTopics.add("variable");
        javaTopics.add("oop");
        javaTopics.add("inheritance");
        javaTopics.add("generics");
        javaTopics.add("lambda expressions");
        javaTopics.add("collections");

        Tester longWords = s -> s.length() > 8;
        List<String> longWordsList = filterList(longWords, javaTopics);
        System.out.println(longWordsList);

        System.out.println("*****");

        Tester startsWithC = s -> s.toLowerCase().startsWith("c");
        List<String> topicsThatStartWithC = filterList(startsWithC, javaTopics);
        System.out.println(topicsThatStartWithC);
    }

    public static List<String> filterList(Tester tester, List<String> originalList) {
        List<String> filteredList = new ArrayList<>();
        for(String s : originalList) {
            if(tester.test(s)) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }
}
