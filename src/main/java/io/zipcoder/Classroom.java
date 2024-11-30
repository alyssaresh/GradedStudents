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
////    **Define method `getStudentsByScore()`**
////            * The class `Classroom` should define a method `getStudentsByScore()`
////            which returns an array representation of `Student` objects sorted in
////            descending order by score.
////	* If two students have the same class average, order them lexigraphically.
//    public ArrayList<Student> getStudentsByScore(){
//        for (Student s: students){
//            students.sort(Student::compareTo);
//        } return students;
//    }

//    * **Define method `getGradeBook()`**
//    The class `Classroom` should define a method `getGradeBook()` which returns a
//    mapping of `Student` objects to a respective letter grade determined by
//    creating a [grading curve](https://en.wikipedia.org/wiki/Grading_on_a_curve) such that
//   An `A` is awarded to students whose class average is in the upper 10th percentile.
//   A `B` is awarded to students whose class average falls between the upper 11th and 29th percentile.
//   A `C` is awarded to students whose class average falls between the upper 30th and 50th percentile.
//   A `D` is awarded to students whose class average falls between the lower 51st and 89th percentile.
//   An `F` is awarded to students whose class average is in the lower 11th percentile.

}


