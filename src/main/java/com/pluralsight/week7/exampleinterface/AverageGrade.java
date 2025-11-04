package com.pluralsight.week7.exampleinterface;

import java.util.ArrayList;
import java.util.List;

public class AverageGrade implements Calculatable {
    private List<Double> grades = new ArrayList<>();

    @Override
    public double calculate(double... values) {
        double total = 0;
        for(double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
