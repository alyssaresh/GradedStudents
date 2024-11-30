package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test
    public void testSetFirstName() {
        Student student = new Student("Deepti", "", new Double[]{100.0, 95.0, 123.0, 96.0});
        String expected = "Deepti";

        // When
        student.setFirstName(expected);
        String actual = student.getFirstName();

        // Then (also tests getFirstName)
        Assert.assertEquals(expected, actual);
        System.out.print(student.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Student student = new Student("Deepti", "Mishra", new Double[]{100.0, 95.0, 123.0, 96.0});
        String expected = "Mishra";

        // When
        student.setLastName(expected);
        String actual = student.getLastName();

        // Then (also tests getLastName)
        Assert.assertEquals(expected, actual);
        System.out.print(student.getLastName());
    }

    @Test
    public void testGetNumberOfExamsTaken() {
        int expected = 4;
        //when
        Student student = new Student("Deepti", "Mishra", new Double[]{100.0, 95.0, 123.0, 96.0});
        int actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamScores() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Student student = new Student("Leon", "Hunter", new Double [] { 100.0, 95.0, 123.0, 96.0 });

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void addExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(98.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void setExamScoreTest(){
        String firstName = "Deepti";
        String lastName = "Mishra";
        Double[] examScores = { 100.00, 98.00, 85.00};
        Student deepti = new Student(firstName, lastName, examScores);

        deepti.setExamScore(1, 95.00);
        String output = deepti.getExamScores();

        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Deepti";
        String lastName = "Mishra";
        Double[] examScores = { 100.00, 80.00, 90.00, 75.00};
        Student deepti = new Student(firstName, lastName, examScores);

        double expected = 86.25;
        double actual = deepti.getAverageExamScore();

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getStudentString(){
        String firstName = "Deepti";
        String lastName = "Mishra";
        Double[] examScores = { 100.00, 80.00, 90.00, 75.00};
        Student deepti = new Student(firstName, lastName, examScores);

        String actual = deepti.toString();

        System.out.print(actual);
    }
}