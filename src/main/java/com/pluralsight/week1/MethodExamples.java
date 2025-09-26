package com.pluralsight.week1;

public class MethodExamples {
    public static void main(String[] args) {
        foo();
        String foo2 = foo2();
        System.out.println(foo2);
        moo();
        int result = getRandomNumber();
        System.out.println(result);
        String greeting = getGreeting();
        System.out.println(greeting);
        greetPerson("Tesfahun", "morning");
        greetPerson("Vita", "morning");
        greetPerson("Nicolas", "evening");
        greetPerson("Vice", "afternoon");
    }

    public static void foo() {
        System.out.println("Foo");
    }

    public static String foo2() {
        return "Foo2";
    }

    public static void moo() {
        System.out.println("Moo");
    }

    public static int getRandomNumber() {
        return (int) Math.round(Math.random() * 100);
    }

    public static String getGreeting() {
        return "Hi!";
    }

    public static void greetPerson(String name, String daypart) {
        String greeting = "Hi ";
        if(daypart.equalsIgnoreCase("morning")) {
            greeting = "Good morning ";
        } else if(daypart.equalsIgnoreCase("afternoon")) {
            greeting = "Good afternoon ";
        } else if(daypart.equalsIgnoreCase("evening")) {
            greeting = "Good evening ";
        }
        System.out.println(greeting + name + "! What a lovely " + daypart);
    }
}

