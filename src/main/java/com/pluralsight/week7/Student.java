package com.pluralsight.week7;

public class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void sayHi() {
        System.out.println("Hi my name is " + getName() + ". I study " + major);
    }

    public void sayHi(String otherPersonName) {
        System.out.println("Hi " + otherPersonName + ", my name is " + getName() + ". I study " + major);

    }
}
