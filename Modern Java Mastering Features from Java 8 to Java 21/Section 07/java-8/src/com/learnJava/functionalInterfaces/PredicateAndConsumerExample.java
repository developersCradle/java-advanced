package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    // Filtering criteria!
    Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    // We will include two Predicates for one Bi Predicate for compact reasons!
    BiPredicate<Integer,Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa>=3.9;
    // Two inputs.
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities)  -> System.out.println(name + " : " + activities );
    Consumer<Student> studentConsumer = ( student -> {

        // If the filtering is fine.
//        if (p1.and(p2).test(student))
// We can use combined predicate for the condition.
        if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa()))
        {
            // Printing with two inputs.
             studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList)
    {
        studentList.forEach(student -> studentConsumer.accept(student));
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
