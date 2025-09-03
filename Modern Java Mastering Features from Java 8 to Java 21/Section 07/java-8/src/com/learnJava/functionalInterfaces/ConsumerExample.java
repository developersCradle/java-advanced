package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    // Lambda embraces the code re-usability.
    static Consumer<Student> c2 = (string) -> System.out.println(string);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static  void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }


    public static void main(String[] args) {

        printName();
        Consumer<String> c1 = (string) -> System.out.println(string.toUpperCase());
        c1.accept("java8");

        printNamesActivities();

        printNamesActivitiesWithTheCondition();

    }

    public static void printNamesActivities()
    {

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c3);
        studentList.forEach(c4);

        //studentList.forEach(c3.andThen(c4)); // This is called consumer chaining.
    }

    // This will be the same, but with the condition.
    public static void printNamesActivitiesWithTheCondition()
    {
        System.out.println("printNamesActivitiesWithTheCondition:");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 ){
                c3.andThen(c4).andThen(c1).accept(student);
            }
        }));
    }
}
