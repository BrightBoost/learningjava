package com.pluralsight.week7.collection;

public class Main {
    public static void main(String[] args) {
        FixedList<String> stringFixedList = new FixedList<>(3);
        stringFixedList.add("bla");
        stringFixedList.add("blabla");
        stringFixedList.add("blablabla");
        stringFixedList.add("blablablabla"); // wont add, exceeds max size
        System.out.println(stringFixedList.getItems());

        // escaping reference
        stringFixedList.getItems().add("hahaha"); // gotcha workaround, we should have sent a copy of the list
        System.out.println(stringFixedList.getItems());
    }
}
