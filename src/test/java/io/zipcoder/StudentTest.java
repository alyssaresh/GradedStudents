package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


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
        ArrayList<Double> scores = new ArrayList<>();
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
        int expected = 0;
        //when
        ArrayList<Double> scores = new ArrayList<>();
        Student student = new Student("Deepti", "Mishra", new Double[]{100.0, 95.0, 123.0, 96.0});
        int actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamScores() {
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student("Leon", "Hunter", new Double [] { 100.0, 95.0, 123.0, 96.0 });

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
}