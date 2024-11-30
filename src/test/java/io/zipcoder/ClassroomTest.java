package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getStudentsTest() {
        Student student1 = new Student("Deepti", "Mishra", new Double[]{100.00, 98.00, 85.00});
        Student student2 = new Student("Sam", "Gru", new Double[]{90.00, 100.00, 80.00});
        Student student3 = new Student("Ron", "John", new Double[]{85.00, 80.00, 90.00});
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(students);
        System.out.print(classroom.getStudents());
    }

    @Test
    public void getAverage() {
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents().toArray(new Student[0]);
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents().toArray(new Student[0]);

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudent() {
        // : Given
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student1 = new Student("Leon", "Hunter", examScores);
        Student student2 = new Student("Deepti", "Mishra", examScores);
        Student student3 = new Student("Dash", "Flach", examScores);

        // When
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Student[] preRemoval = classroom.getStudents().toArray(new Student[0]);
        classroom.removeStudent("Deepti", "Mishra");
        Student[] postRemoval = classroom.getStudents().toArray(new Student[0]);

        // Then
        String preRemovalString = Arrays.toString(preRemoval);
        String postRemovalString = Arrays.toString(postRemoval);

        System.out.println("===========================");
        System.out.println(preRemovalString);
        System.out.println("===========================");
        System.out.println(postRemovalString);
    }
}
