package com.pluralsight.week2;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder addressBuilder = new StringBuilder();
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        addressBuilder.append(scanner.nextLine());
        addressBuilder.append("\n\n");
        buildAddressPart("Billing", addressBuilder);
        buildAddressPart("Shipping", addressBuilder);

        System.out.println("**************");
        System.out.println(addressBuilder.toString());
    }

    public static void buildAddressPart(String typeOfAddress, StringBuilder sb) {
        sb.append(typeOfAddress + " address: \n");
        System.out.print(typeOfAddress + " street: ");
        sb.append(scanner.nextLine());
        sb.append("\n");
        System.out.print(typeOfAddress + " city: ");
        sb.append(scanner.nextLine());
        sb.append("\n");
        System.out.println(typeOfAddress + " state:");
        sb.append(scanner.nextLine());
        sb.append("\n");
        System.out.println(typeOfAddress + " zip:");
        sb.append(scanner.nextLine());
        sb.append("\n");
    }
}
