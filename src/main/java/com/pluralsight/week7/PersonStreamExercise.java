package com.pluralsight.week7;

import java.util.List;

public class PersonStreamExercise {
    public static void main(String[] args) {
        Person p1 = new Person("Person 1", 20);
        Person p2 = new Person("Person 2", 22);
        Person p3 = new Person("Person 3", 23);
        Person p4 = new Person("Person 4", 24);
        Person p5 = new Person("Person 5", 25);
        Person p6 = new Person("Person 6", 26);
        Person p7 = new Person("Person 7", 27);
        Person p8 = new Person("Person 8", 28);
        Person p9 = new Person("Person 9", 29);
        Person p10 = new Person("Person 10", 30);

        List<Person> people = List.of(p2, p3, p1, p4, p5, p6, p7, p8, p9, p10);

    }

    public static List<Person> searchByName(List<Person> people, String name) {
        return people.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .toList();
    }

    public static int averageAgeOfPeople(List<Person> people) {
        int combinedAge = people.stream()
                .map(person -> person.getAge())
                .reduce(0, (x, y) -> x + y);
        return combinedAge / people.size();
    }

    public static int findYoungestAge(List<Person> people) {
        return people.stream()
                .map(person -> person.getAge())
                .sorted()
                .toList().getFirst();
    }

    public static int findOldestAge(List<Person> people) {
        return people.stream()
                .map(person -> person.getAge())
                .sorted()
                .toList().getLast();
    }
}
