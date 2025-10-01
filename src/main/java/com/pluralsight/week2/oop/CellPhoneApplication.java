package com.pluralsight.week2.oop;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp = new CellPhone();
        System.out.println("What is the serial number?");
        cp.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What is the model of the phone?");
        cp.setModel(scanner.nextLine());
        System.out.println("Who's the carrier?");
        cp.setCarrier(scanner.nextLine());
        System.out.println("What is the phone nr?");
        cp.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        cp.setOwner(scanner.nextLine());

        System.out.printf("The %s with serial number %d by carrier %s and phone nr %s is owned by %s.", cp.getModel(), cp.getSerialNumber(), cp.getCarrier(), cp.getPhoneNumber(), cp.getOwner());
    }
}
