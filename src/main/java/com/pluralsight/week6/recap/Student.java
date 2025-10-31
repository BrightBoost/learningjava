package com.pluralsight.week6.recap;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double gpa;
    private List<String> subjects = new ArrayList<>();

    public Student(String name, double gpa, List<String> subjects) {
        super(name);
        this.gpa = gpa;
        this.subjects = subjects;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void printSummary(){
        System.out.println(getName() + " has an average GPA of " + gpa);
    }
}
