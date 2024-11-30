package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.examScores = null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String exams = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++) {
            exams += "    Exam " + (i+1) + " -> " + examScores.get(i) + "\n";
        }
        return exams;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int testNum, double grade) {
        examScores.set(testNum-1, grade);
    }

    public double getAverageExamScore() {
        int total = 0;
        for (int i = 0; i < examScores.size(); i++){
            total+= examScores.get(i);
        } return (double) total /examScores.size();
    }

    @Override
    public String toString(){
        return String.format("Student Name: %s %s\n> Average Score: %.2f\n> ", firstName, lastName, getAverageExamScore()) + getExamScores();
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getAverageExamScore(), o.getAverageExamScore());
    }
}

//Student Name: Leon Hunter
//			> Average Score: 125
//        > Exam Scores:
//Exam 1 -> 100
//Exam 2 -> 150
//Exam 3 -> 250
//Exam 4 -> 0