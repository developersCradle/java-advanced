package com.learnJava.functionalInterfaces;


import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    // First criteria for the GradeLevel.
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    // Second criteria for the GBA.
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static  void filterStudentByGradeLevel()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.test(student))
            {
                System.out.println("Student matches the Grade Level criteria:" + student);
            }
        });
    }
    public static  void filterStudentByGpa()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (p2.test(student))
            {
                System.out.println("Student matches the GPA criteria:" + student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();

        filterStudentByGpa();
    }

}