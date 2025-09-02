package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    public static  void printName(){
        Consumer<Student> c2 = (string) -> System.out.println(string);

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }


    public static void main(String[] args) {

        printName();


        //Consumer<String> c1 = (string) -> System.out.println(string.toUpperCase());
        //c1.accept("java8");

    }
}
