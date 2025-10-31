package com.pluralsight.week6.recap;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printSummary(){
        System.out.println("Hello, I'm " + name);
    }
}
