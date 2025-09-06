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

<div align="center">
    <img src="consumerMethods.jpg"  alt="java advanced" width="500"/>
</div>

- Example code is from. [Consumer Functional Interface](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/functionalInterfaces/ConsumerExample.java).

- The `Consumer` interface from **Java**.

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

- You can see, the following order `c3` and then `c4`. This **WONT** be **returned/executed** until the `1.` `.accept(student)` is executed for given **student**!


> [!TIP]
> We can chain **n** number of times the using the `.andThen()` as example: <br> `c3.andThen(c4).andThen(c1).accept(student);`.


# Lab : BiConsumer Functional Interface.

- Example code is from. [BiConsumer Functional Interface](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/functionalInterfaces/BiConsumerExample.java).

- **BiConsumer** is extension to **Consumer**.

- The **BiConsumer** interface in **Java**.

````
/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link Consumer}.
 * Unlike most other functional interfaces, {@code BiConsumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object)}.
 *
 * @param <T> the type of the first argument to the operation
 * @param <U> the type of the second argument to the operation
 *
 * @see Consumer
 * @since 1.8
 */
@FunctionalInterface
public interface BiConsumer<T, U> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     */
    void accept(T t, U u);

    /**
     * Returns a composed {@code BiConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code BiConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }
}
````

- As you can see the **BI** accepts two `void accept(T t, U u);`.
    - Accepts **two** inputs.

- Example of the `biConsumer` simple case. 

````
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println(" a : "  +  a + " b : " + b );
        };
        biConsumer.accept("java7" , "java8");
````

- Example using multiple `biConsumers` after each other.

````
        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiplication : " + (a * b));
        };


        BiConsumer<Integer, Integer> addition = (a,b) -> {
            System.out.println("Addition : " + (a + b));
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division : "  + (a / b));
        };


        multiply.andThen(addition).andThen(division).accept(10,5);
````

- The **BiConsumer** usage with the `student` example. 

````
    public static void nameAndActivities(){

        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }
````

# Lab : Predicate - Functional Interface - Part 1.

<div align="center">
    <img src="predicateMethods.jpg"  alt="java advanced" width="600"/>
</div>

- **Predicate** are used to **test** something. These will return **boolean** as result. 

- We will be exploring the **Predicate** from the Java **SDK** as following:

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
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object)}.
 *
 * @param <T> the type of the input to the predicate
 *
 * @since 1.8
 */
@FunctionalInterface
public interface Predicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(T t);

    /**
     * Returns a composed predicate that represents a short-circuiting logical
     * AND of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code false}, then the {@code other}
     * predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ANDed with this
     *              predicate
     * @return a composed predicate that represents the short-circuiting logical
     * AND of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    /**
     * Returns a predicate that represents the logical negation of this
     * predicate.
     *
     * @return a predicate that represents the logical negation of this
     * predicate
     */
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    /**
     * Returns a composed predicate that represents a short-circuiting logical
     * OR of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code true}, then the {@code other}
     * predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ORed with this
     *              predicate
     * @return a composed predicate that represents the short-circuiting logical
     * OR of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    /**
     * Returns a predicate that tests if two arguments are equal according
     * to {@link Objects#equals(Object, Object)}.
     *
     * @param <T> the type of arguments to the predicate
     * @param targetRef the object reference with which to compare for equality,
     *               which may be {@code null}
     * @return a predicate that tests if two arguments are equal according
     * to {@link Objects#equals(Object, Object)}
     */
    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }

    /**
     * Returns a predicate that is the negation of the supplied predicate.
     * This is accomplished by returning result of the calling
     * {@code target.negate()}.
     *
     * @param <T>     the type of arguments to the specified predicate
     * @param target  predicate to negate
     *
     * @return a predicate that negates the results of the supplied
     *         predicate
     *
     * @throws NullPointerException if target is null
     *
     * @since 11
     */
    @SuppressWarnings("unchecked")
    static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return (Predicate<T>)target.negate();
    }
}
````

- We can see different, **methods** from the **Predicate** class.
    - The main one is the `boolean test(T t);`, to test the given input.

``` 
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

```

- We will use the `default Predicate<T> and(Predicate<? super T> other)` to chain the **Predicates**, example of this one:
    - We have the following **Predicates**.
        - `Predicate<Integer> isPositive = x -> x > 0;`.
        - `Predicate<Integer> isEven = x -> x % 2 == 0;`.
            - We will chain them.
                - `Predicate<Integer> positiveAndEven = isPositive.and(isEven);`.

```
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }
```

- We will use the `default Predicate<T> negate()` to **negate** the flip the **result of a predicate**.

````
    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
````

- Todo this.

````

    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
````

- Todo this.

````
    static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return (Predicate<T>)target.negate();
    }
````

- We will be exploring these concepts using **examples**.

- The **Predicate** tests the **even number**.

````
static Predicate<Integer> p = (i) -> {return  i%2 ==0;};

System.out.println("Result is p : " + p.test(2));
````

- This will be returning **boolean**, in this case **true**. Also, we can use this, without the `{}` as following:

````
static Predicate<Integer> p1 = (i) -> i%2 ==0;

System.out.println("Result is p1 : " + p1.test(3));
````

- We will explore `.and` methods of the **Predicate**. This is called **predicate chaining**.

````
static Predicate<Integer> p1 = (i) -> i%2 ==0;
static Predicate<Integer> p2 = (i) -> i%5 ==0;

public static void predicateAnd(){
    System.out.println("Result in predicateAnd, this example we will use the 10: " + p1.and (p2).test(10));
    System.out.println("You can see that, the 10 is divisible by 2 and is divisible by 5.");
    System.out.println("Result in predicateAnd, this example we will use the 12: " + p1.and (p2).test(12));
    System.out.println("You can see that, the 12 is divisible by 2, but not the 5.");
}

````

- We will explore `.or` methods of the **Predicate**. This is called **predicate chaining**.
    - This **Predicate** chain return **true**, either if `p1` or `p2` return **true**.

````
    public static void predicateOr(){

        static Predicate<Integer> p1 = (i) -> i%2 ==0;
        static Predicate<Integer> p2 = (i) -> i%5 ==0;

        System.out.println("Predicate OR result is : " + p1.or(p2).test(10));
        System.out.println("Predicate OR result is : " + p1.or(p2).test(9));
    }
````

- We will explore `.negate` method of the **Predicate**. This is called **predicate chaining**.
    - This `.negate` will change the output of the result.

````
    public static void predicateNegate(){
        static Predicate<Integer> p1 = (i) -> i%2 ==0;
        static Predicate<Integer> p2 = (i) -> i%5 ==0;

        System.out.println("Result in predicateNegate : " + p1.and(p2).negate().test(10)); //equivalent to reversing the result
    }
````

# Lab : Predicate - Functional Interface - Part 2.

- Example code is from. [Predicate Functional Interface](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/functionalInterfaces/PredicateStudentExample.java).

- The **Predicate** usage with the `student` example. We will **filter** based one the criteria. 

````
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
````

<div align="center">
    <img src="predicateFilteringExample.jpg"  alt="java advanced" width="800px" height="500px"/>
</div>

1. There is filter **Predicate** `p1` for filtering based one the **GPA**.
2. There is filter **Predicate** `p1` for filtering based one the **Grade Level**.


# Lab : Combining Predicate + Consumer.

# Lab : BiPredicate.

# Lab : Function - Function Interface - Part 1.

<div align="center">
    <img src="functionMethods.jpg"  alt="java advanced" width="600"/>
</div>


# Lab : Function - Function Interface - Part 2.

# Lab : BiFunction Functional Interface.

# Lab : UnaryOperator and BinaryOperator Functional Interface.

# Lab : Supplier - Functional Interface.

<div align="center">
    <img src="supplierMethods.jpg"  alt="java advanced" width="600"/>
</div
