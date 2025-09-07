package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {


    // Filtering criteria!
    Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    // Two inputs.
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {

    };


    Consumer<Student> studentConsumer = ( student -> {
        if (p1.and(p2).test(student))
        {

        }
    });


    public void printNameAndActivities()
    {

    }





    public static void main(String[] args) {

    }


}
