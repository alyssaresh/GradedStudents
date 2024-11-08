package io.zipcoder;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
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
        return examScores.length;
    }

    public String getExamScores() {
        String reportCard = "Exam Scores:\n";
        for (int i = 0; i < examScores.length; i++) {
            reportCard += "    Exam " + i + " -> " + examScores[i] + "\n";
        }
        return reportCard;
    }
}