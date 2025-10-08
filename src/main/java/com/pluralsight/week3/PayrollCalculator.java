package com.pluralsight.week3;

import java.io.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        Employee[] employees = new Employee[getNrOfEmployees()];

        try {
            FileReader fileReader = new FileReader("files/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String employeeString;

            int index = 0;
            while((employeeString = bufferedReader.readLine()) != null) {
                // split on the pipe
                String[] employeeArr = employeeString.split("\\|");
                // create an employee object
                Employee employee = new Employee(Integer.parseInt(employeeArr[0]), employeeArr[1], Double.parseDouble(employeeArr[2]), Double.parseDouble(employeeArr[3]));
                // display the employee
                employees[index++] = employee;
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        createPayrollFile("payroll-sept-2023.csv", employees);
    }

    public static void createPayrollFile(String fileName, Employee[] employees) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/" + fileName));
            for(Employee e : employees) {
                bufferedWriter.write(e.toCsvPayrollString()+ "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getNrOfEmployees() {
        int employeeCount = 0;

        try {
            FileReader fileReader = new FileReader("files/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            while(bufferedReader.readLine() != null) {
                employeeCount++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeCount;
    }
}
