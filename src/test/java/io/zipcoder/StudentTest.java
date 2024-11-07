package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class StudentTest {

    @Test
    public void testSetFirstName() {
        ArrayList<Double> scores = new ArrayList<>();
        Student student = new Student("Deepti", "", scores);
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
        Student student = new Student("Deepti", "Mishra", scores);
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
        Student student = new Student("Deepti", "Mishra", scores);
        int actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }
}