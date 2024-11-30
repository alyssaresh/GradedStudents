package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private ArrayList<Student> students;

    public Classroom(){
        //        3. The class `Classroom` should define a [nullary constructor]
        //        (https://en.wikipedia.org/wiki/Nullary_constructor) which initializes
        //        the composite `students` object to be an empty array of 30 `Student` objects.

        this.students = new ArrayList<>(30);
    }
    public Classroom(int maxNumberOfStudents){
        //	1. The class `Classroom` should define a constructor which
        //	takes an argument of an `int` representative of the `maxNumberOfStudents`
        //	that this `Classroom` can hold.
        this.students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(Student[] students){
        //        2. The class `Classroom` should define an additional constructor
        //        which takes an argument of `Student[]` representative of the
        //        collection of `Student` objects this `Classroom` will store.
        this.students = new ArrayList<>(Arrays.asList(students));
        }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public double getAverageExamScore() {
        int totalStudents = students.size();
        double totalScores = 0;
        for (Student s : students){
            totalScores += s.getAverageExamScore();
            }
        return totalScores/totalStudents;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        for (Student s: students){
            if (s.getFirstName() == firstName && s.getLastName() == lastName){
                students.remove(s);
            }
        }
    }
}


