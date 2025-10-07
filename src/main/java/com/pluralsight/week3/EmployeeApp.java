package com.pluralsight.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeApp {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("files/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String employeeString;
            while((employeeString = bufferedReader.readLine()) != null) {
                // split on the pipe
                String[] employeeArr = employeeString.split("\\|");
                // create an employee object
                Employee employee = new Employee(Integer.parseInt(employeeArr[0]), employeeArr[1], Double.parseDouble(employeeArr[2]), Double.parseDouble(employeeArr[3]));
                // display the employee
                System.out.printf("The employee %s with id %d pay is $%.2f\n", employee.getName(), employee.getEmployeeId(), employee.getGrossPay());
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
