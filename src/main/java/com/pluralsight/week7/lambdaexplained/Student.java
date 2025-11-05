package com.pluralsight.week7.lambdaexplained;

import java.util.List;

public class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> findCoursesWithName(String name) {
        return courses.stream()
                .filter(course -> course.contains(name))
                .toList();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
