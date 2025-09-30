package com.pluralsight.week2;

import java.util.Scanner;

public class RentalCarCompany {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String pickupDate = getPickupDate();
        int nrOfDays = getNrOfDays();
        int age = getAge();
        boolean tolltag = getOption("tolltag", 3.95);
        boolean gps = getOption("GPS", 2.95);
        boolean roadsideAssistance = getOption("roadside assistance", 3.95);

        calculateTotalCosts(29.99, pickupDate, nrOfDays, tolltag, gps, roadsideAssistance, age);
    }

    public static String getPickupDate() {
        System.out.println("What date would you like to pick up the car?");
        return scanner.nextLine();
    }

    public static int getNrOfDays() {
        System.out.println("How many days will you need the car?");
        int nrOfDays = scanner.nextInt();
        scanner.nextLine();
        return nrOfDays;
    }

    public static boolean getOption(String option, double price) {
        System.out.printf("Do you want %s for %.2f? Yes/no\n", option, price);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("yes");
    }

    public static int getAge() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static double calculateTotalCosts(double baseRate, String pickupDate, int nrOfDays, boolean tolltag, boolean gps, boolean roadsideAssistance, int age) {
        double pricePerDay = baseRate + (tolltag ? 3.95 : 0) + (gps ? 2.95 : 0) + (roadsideAssistance ? 3.95 : 0);
        if(age < 25) {
            pricePerDay += 0.3 * baseRate;
        }
        double totalPrice = pricePerDay * nrOfDays;
        System.out.println("price per day is: " + pricePerDay);
        System.out.printf("total for %d days is %.2f", nrOfDays, totalPrice);
        return totalPrice;
    }
}
