package com.pluralsight.week7.lambdaexplained;

import java.util.ArrayList;
import java.util.List;

public class StudentCoolStuffExample {
    public static void main(String[] args) {
        Student student1 = new Student("Jenver", List.of("computer science", "java", "physics", "math"));
        Student student2 = new Student("Birkti", List.of("computer science", "java", "physics", "project management"));
        Student student3 = new Student("Hana", List.of("computer science", "python", "biology", "math"));
        Student student4 = new Student("Ricky", List.of("art", "economics", "philosophy", "statistics"));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentFilter filterByNameEqualToRicky = student -> student.getName().equalsIgnoreCase("Ricky");
        StudentFilter filterByCourse = student -> student.getCourses().contains("math");

        List<Student> studentsCalledRicky = filterStudents(filterByNameEqualToRicky, students);
        List<Student> studentsWithMath = filterStudents(filterByCourse, students);

        System.out.println(studentsCalledRicky);
        System.out.println(studentsWithMath);



    }

    public static List<Student> filterStudents(StudentFilter studentFilter, List<Student> originalStudents) {
        List<Student> filteredStudents = new ArrayList<>();
        for(Student student : originalStudents) {
            if(studentFilter.filter(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
