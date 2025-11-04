package com.pluralsight.week7;

public class MainBiHolderApp {
    public static void main(String[] args) {
        BiHolder<String,Boolean> bh = new BiHolder<>("ok", true);
        BiHolder<Boolean,String> swapped = bh.swap();
        System.out.println(swapped.getFirst()); // true
        System.out.println(swapped.getSecond()); // ok
    }
}
