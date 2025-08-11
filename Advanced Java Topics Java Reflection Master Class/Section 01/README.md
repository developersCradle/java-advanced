# Section 01: Introduction to Reflection.

Introduction to Reflection.

# What I Learned.

# Introduction to Java Reflection

<img src="topicsForTheLecture.PNG"  alt="java reflection course" width="500"/>

1. 🙏🙏🙏 Give me motivation for finishing this course!!!✝️

<img src="WhatIsJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. Its **powerful** feature from **JVM** and **Language**, which allows us to get **runtime** access to information to application's **classes** and **objects**!!

2. To use these functionalities or classes, we use `Reflection API`.
    - This is shipped by **JDK**.

<img src="whatDoesTheWeCanDoWithTheJavaReflection.PNG"  alt="java reflection course" width="600"/>

1. We can **link** software components at **runtime**.
2. This **allows** us to introduce **new workflows**, without modification of the **original source code**.
3. We can **adapt** from the projects given classes, to apply for the **algorithms**.

<img src="programWhitoutRefleciton.PNG"  alt="java reflection course" width="600"/>

1. Old way is that, we give **data** to the input, then we **analyze** the data and perform some operations on it and give **some output**

<img src="programWithRefleciton.PNG"  alt="java reflection course" width="600"/>

1. With the **reflection**, we can **process** `code` and `data` as **inputs** to produce output.

<img src="aboutReflection.PNG"  alt="java reflection course" width="600"/>

1. **Code** and **data** as **input**.
2. We can **achieve** powerful features, for the:
    - Libraries
    - Frameworks
    - Software Designs
- That would otherwise be impossible.

<img src="mostPopularLibraryThatUsesJavaReflection.PNG"  alt="java reflection course" width="600"/>

1. **JUnit**.

- Example of the **library** that uses **Java reflection**:

<img src="libraryThatUsesJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. Without **Java Reflection**, we would need to **set up** test classes. Likes such:

```
public class CarTest {
    public void setUp() { .. }
    public void testDrive() { .. }
    public void testBrake() { .. }
    ...
    public static void main() {
        CarTest carTest = new CarTest(); // Example here.
        carTest.setUp(); // Example here.
    }
}
```

<img src="libraryAfterUsingTheJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. With **Java reflection**, we can remove **boiler code** and focus to tests.
2. With **only** annotations, we can achieve all these steps! Even the test are ran in order.

<img src="anotherUseCaseForJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. Another users of **Java reflection** are frameworks with **Dependency Injection** like:
    - Spring.
    - Google Guice.

<img src="dependencyInjection.PNG"  alt="java reflection course" width="500"/>
