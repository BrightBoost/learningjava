package com.pluralsight.week7;

public class MainPairApp {
    public static void main(String[] args) {
        Pair<String,Integer> p1 = new Pair<>("age", 30);
        Pair<Integer,String> p2 = new Pair<>(1, "one");
        System.out.println(p1); // (age=30)
        System.out.println(p2); // (1=one)
    }
}
