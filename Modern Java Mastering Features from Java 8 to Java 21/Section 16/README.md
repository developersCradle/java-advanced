# Section 16: Optional.

Optional.

# What I Learned.

<details>
<summary id="IDE problem" open="false"> Some own examples of using <b>Optional</b>. </summary>

#### Old code:

````
if (obj == null) {
    return null;
}

Name name = obj.getName();
if (name == null) {
    return null;
}

String first = name.getFirst();
if (first == null) {
    return null;
}

return first;
````

#### Refactored code:

````
return Optional.ofNullable(obj)
               .map(MyObj::getName)
               .map(Name::getFirst)
               .orElse(null);
````

- Previous code will be having **short-circuiting**, if `null` is found. 
    - If **any** value is **missing**:
        - `obj` is `null`.
        - `obj.getName()` is `null`.
        - `name.getFirst()` is `null`.
    - The chain becomes `Optional.empty`,
        - and then `.orElse(null)` returns `null`.

#### Old code:

````
String city = null;
if (user != null && user.getAddress() != null) {
    city = user.getAddress().getCity();
}
````

#### Refactored code:

````
String city = Optional.ofNullable(user)
                      .map(User::getAddress)
                      .map(Address::getCity)
                      .orElse(null);
````

- ✅ Benefits ✅:
    - Removes boilerplate if checks.
    - Clear chain of transformations.
    - Avoids `NullPointerException`.

<hr>

#### Old code:

````
String firstName = null;
if (obj != null) {
    Name name = obj.getName();
    if (name != null) {
        firstName = name.getFirst();
    }
}
````

#### Refactored code:

````
String firstName = Optional.ofNullable(obj)
                           .map(MyObj::getName)
                           .map(Name::getFirst)
                           .orElse(null);
````

- ✅ Benefits ✅:
    - Handles multiple levels of `null` safely.
    - Easy to read and maintain.

</details>

# Introduction to Optional.

- [The source code for the chapter](https://github.com/dilipsundarraj1/java-8/blob/master/java-8/src/com/learnJava/optional/OptionalExample.java).

<div align="center">
    <img src="introductionToOptionals.PNG"  alt="java advanced" width="500"/>
</div>

1. `Optional` is to represent the `non-null` value.

2. This to avoids the `non null` exception and other point is to make clearer to make null checks.


<details>
<summary id="Exmample of the Student database" open="false"> <b>StudentDataBase</b> Example:</summary>

````
package com.learnJava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
       return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
    };

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"),12);
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"),10);
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"),9);
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"),15);
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"),14);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }

}
````

</details>

- Example of use case, where we can have `null` value.

````
    public static String getStudentName(){

        Student student = StudentDataBase.studentSupplier.get();
//        Student student = null;
        if(student!=null){
            return student.getName();
        }

        return null;
    }
````




- `Student student = StudentDataBase.studentSupplier.get();`.
    - We are getting student using following.

<details>
<summary id="Code example" open="false"> Code examples after this chapter. </summary>

- Code goes here:


</details>

# Lab: Optional — `empty()`, `ofNullable()`, `of()`.

# Lab: `orElse()`, `orElseGet()`, `orElseThrow()`.

# Lab: `ifPresent()`, `isPresent()`.

# Lab: `map()`, `flatMap()`, `filter()` — Part 1.

# Lab: `map()`, `flatMap()`, `filter()` — Part 2.

