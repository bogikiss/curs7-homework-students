package org.fasttrackit.won14.curs7.homework7students;

public class Student {
    private String name;
    private Integer grade;
    private static Integer numOfStudents = 0;
    private static double sumOfGrades = 0;
    private static double averageOfGrades;

    public static double getAverageOfGrades() {
        return sumOfGrades / numOfStudents;
    }

    public Student(String name, Integer grade){
        this.name = name;
        this.grade = grade;
        numOfStudents++;
        sumOfGrades = sumOfGrades + grade;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public static Integer getNumOfStudents(){
        return numOfStudents;
    }

    public static double getSumOfGrades(){
        return sumOfGrades;
    }
}
