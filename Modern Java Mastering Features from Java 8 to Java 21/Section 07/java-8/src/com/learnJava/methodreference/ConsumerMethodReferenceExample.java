package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = (string) -> System.out.println(string);

    // Method reference way.
    static Consumer<Student> c2 = System.out::println;

    static Consumer<Student> c3 = Student::pringListOfTheActivities;

    public static void main(String[] args) {

        // This is the old way.
        StudentDataBase.getAllStudents().forEach(c1);



        // Method reference way.
        StudentDataBase.getAllStudents().forEach(c2);

        // This is the new function.
        StudentDataBase.getAllStudents().forEach(c3);



    }
}
