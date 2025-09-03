# Section 07: Lambdas and Functional Interfaces. 

Lambdas and Functional Interfaces.

# What I Learned.

# Introduction to Functional Interfaces.

<div align="center">
    <img src="functionalInterfaces.PNG"  alt="java advanced" width="500"/>
</div>

1. In the **past** these were introduced in **Java 1.0**, and it was called **Single Abstract Methods**!

2. These were introduced from the **Java 8** and its recommendation to use the annotation `@FunctinalInterface`.

<div align="center">
    <img src="mainFunctionalInterfaces.PNG"  alt="java advanced" width="500"/>
</div>

- These are **four** main **Functional Interfaces**.
    - **Consumer**.
    - **Predicate**.
    - **Function**.
    - **Supplier**.

<div align="center">
    <img src="newFunctionalInterfacesInTheJava8.PNG"  alt="java advanced" width="500"/>
</div>

<div align="center">
    <img src="newFunctionalInterfacesInTheJava8InterfaceExtensions.PNG"  alt="java advanced" width="500"/>
</div>

1. **Consumer** has the interface **BiConsumer**

2. **Predicate** has the **BiPredicate**.

3. **Function** has the **BiFunction**, **UnaryOperator** and **BinaryOperator**.

# Lab : Consumer Functional Interface - Part 1.

- Example code is from. [Consumer Functional Interface](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/functionalInterfaces/ConsumerExample.java).

- The `Consumer` interface in **Java**.

````
/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.util.function;

import java.util.Objects;

/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object)}.
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 */
@FunctionalInterface
public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t);

    /**
     * Returns a composed {@code Consumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code Consumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
````

<div align="center">
    <img src="functionalInterfacesThatWereIntroducedInJava8.PNG"  alt="java advanced" width="400"/>
</div>

1. All these are introduced in **Java 8**, as **Functional Interfaces**.

- To perform of **Consumer** is that it **accepts input** and **perform operation**.

- Example of using the **Consumer**.
    - Assigns **Lambda Expression**.
    - Execute it by `.accept("Some text")`.

````
package com.learnJava.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> c1 = (string) -> System.out.println(string.toUpperCase());
        c1.accept("java8");

    }
}
````

# Lab : Consumer Functional Interface - Part 2.

- Example code is from. [Consumer Functional Interface](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/functionalInterfaces/ConsumerExample.java).

- We will have the following classes `student` and `studentDatabase`.

````
package com.learnJava.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;


    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }


}
````

- And the `studentDataase`.

````
package com.learnJava.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
````

- We can see the `.forEach` method using he `Consumer` **Functional Interface**.

````
    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
````

- The **default** gives the interface default behavior.

- We are illustrating the `.forEach()` action:

````
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
````


- We can use two **Consumers** in a chain.

````
public static void printNamesActivities()
    {
        Consumer<Student> c3 = (student) -> System.out.println(student.getName());
        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c3.andThen(c4)); // This is called consumer chaining.
    }
````

- This is called **consumer chaining** `studentList.forEach(c3.andThen(c4)); // This is called Consumer Chaining.`.

- We could do this as below, but this would need to loop **two** times.

````
    public static void printNamesActivities()
    {
        Consumer<Student> c3 = (student) -> System.out.println(student.getName());
        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c3);
        studentList.forEach(c4);
    }
````

- We can achieve code re-usability with **Lambda Expression**, as following are defined:
    - `static Consumer<Student> c2 = (string) -> System.out.println(string);`
    - `static Consumer<Student> c3 = (student) -> System.out.println(student.getName());`
    - `static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());`


````
public static void printNamesActivitiesWithTheCondition()
    {

        System.out.println("printNamesActivitiesWithTheCondition:");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3){
                c3.andThen(c4).accept(student);
            }
        }));
    }
````

<div align="center">
    <img src="consumerChaining.PNG"  alt="java advanced" width="500"/>
</div>

1. You can see, the following order `c3` and then `c4`. This **WONT** be **returned/executed** until the `1.` `.accept(student)` for given **student**!
    

> [!TIP]
> We can chain **n** number of times the using the `.andThen()` as example: <br> `c3.andThen(c4).andThen(c1).accept(student);`.
    

# Lab : BiConsumer Functional Interface.

# Lab : Predicate - Functional Interface - Part 1.

# Lab : Predicate - Functional Interface - Part 2.

# Lab : Combining Predicate + Consumer.

# Lab : BiPredicate.

# Lab : Function - Function Interface - Part 1.

# Lab : Function - Function Interface - Part 2.

# Lab : BiFunction Functional Interface.

# Lab : UnaryOperator and BinaryOperator Functional Interface.

# Lab : Supplier - Functional Interface.