package com.pluralsight.week2.oop;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Person p = createPersonObject();
        printPerson(p);
    }

    public static Person getHenk() {
        Person p = new Person("Henk", 5);
        return p;
    }

    public static Person createPersonObject() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        person.setName(scanner.nextLine());
        System.out.println("What's your age?");
        person.setAge(scanner.nextInt());
        scanner.nextLine();
        return person;
    }

    public static void printPerson(Person person) {
        System.out.printf("%s is %d years old", person.getName(), person.getAge());
    }
}
