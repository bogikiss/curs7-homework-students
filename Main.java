package org.fasttrackit.won14.curs7.homework7students;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anne", 10);
        Student student2 = new Student("Bob", 6);
        Student student3 = new Student("Grace", 9);
        System.out.println("Number of students: " + Student.getNumOfStudents());
        System.out.println("Sum of grades: " + (int)Student.getSumOfGrades());
        System.out.println("Average of grades: " + Student.getAverageOfGrades());
    }
}
