package com.pluralsight.week1;

import java.util.Scanner;

public class ManyScanners {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        personQuestions();
        jobQuestions();
    }

    public static void personQuestions() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }

    public static void jobQuestions() {
        System.out.println("What's your job?");
        String job = scanner.nextLine();
        System.out.println("Cool: " + job);
    }
}
