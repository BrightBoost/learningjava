package com.pluralsight.week2.exercisecalcwithmethods;

import java.util.Scanner;

public class PayrollCalculator {
    // creating a scanner
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // get name, hours worked and payrate
        String name = getName();
        double hoursWorked = getHoursWorked();
        double rate = getPayrate();
        // calculate gross pay
        double grossPay = calcGrossPay(hoursWorked, rate);

        // display the output
        displayGrossPay(name, hoursWorked, rate, grossPay);
    }

    public static String getName() {
        System.out.println("What is the employee's name?");
        String employeeName = scanner.nextLine();
        return employeeName;
    }

    public static double getHoursWorked() {
        System.out.println("What is their hours worked?");
        double hoursWorked = scanner.nextDouble();
        scanner.nextLine();
        return  hoursWorked;
    }

    public static double getPayrate() {
        System.out.println("What is their payrate?");
        double payRate = scanner.nextDouble();
        scanner.nextLine();
        return payRate;
    }

    public static double calcGrossPay(double hoursWorked, double payRate) {
        double grossPay = 0;
        if(hoursWorked >= 40) {
            grossPay = (hoursWorked - 40) * payRate * 1.5 + 40 * payRate;
        } else {
            grossPay = payRate * hoursWorked;
        }
        return grossPay;
    }

    public static void displayGrossPay(String employeeName, double hoursWorked, double payRate, double grossPay) {
        System.out.printf("%s worked %.2f hours for %.2f pay rate. This leads to a total gross pay of %.2f", employeeName, hoursWorked, payRate, grossPay);
    }
}
