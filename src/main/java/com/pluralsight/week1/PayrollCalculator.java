package com.pluralsight.week1;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        // creating a scanner
        Scanner scanner = new Scanner(System.in);

        // get name, hours worked and payrate
        System.out.println("What is the employee's name?");
        String employeeName = scanner.nextLine();

        System.out.println("What is their hours worked?");
        double hoursWorked = scanner.nextDouble();

        System.out.println("What is their payrate?");
        double payRate = scanner.nextDouble();

        // calculate gross pay
        // optional: overtime rate
        double grossPay = 0;
        if(hoursWorked >= 40) {
            grossPay = (hoursWorked - 40) * payRate * 1.5 + 40 * payRate;
        } else {
            grossPay = payRate * hoursWorked;
        }

        // display the output
        System.out.printf("%s worked %.2f hours for %.2f pay rate. This leads to a total gross pay of %.2f", employeeName, hoursWorked, payRate, grossPay);
    }
}
