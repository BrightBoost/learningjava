package com.pluralsight.week7;

public class MainMapperApp {
    public static void main(String[] args) {
        Mapper<String,Integer> m1 = new ToLength();
        Mapper<Double,String>  m2 = new ToString();
        System.out.println(m1.map("hello")); // 5
        System.out.println(m2.map(3.14));    // "3.14"
    }
}
