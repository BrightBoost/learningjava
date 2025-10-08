package com.pluralsight.week3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollCalculatorWithList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
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
                employees.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        createPayrollFile("payroll-sept-2023.csv", employees);
    }

    public static void createPayrollFile(String fileName, List<Employee> employees) {
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


}
