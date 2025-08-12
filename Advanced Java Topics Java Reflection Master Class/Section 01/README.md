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

1. Without **dependency injection**, we would need to take care of initiating the Cars **Engine()** and **createDriver()** implementations!
    - This tightly couples, the details of the dependency to the Car itself!

<img src="dependencyInjectionWorking.PNG"  alt="java reflection course" width="500"/>

1. In **Spring,** we can define the `Car` class and delegate the creation of its component somewhere else in **code**. 
    - This using `@Autowired` annotation.

<img src="reflectionBeanAnnotation.PNG"  alt="java reflection course" width="500"/>

1. Spring will register these Object, with using `@Configuaration` and `@Bean` annotation. At this point **Spring** knows, that these needs to be injected at runtime.

<img src="usingReflectionWithBeans.PNG"  alt="java reflection course" width="500"/>

1. These are **created** and **injected** at runtime.

<img src="creationOfTheCar.PNG"  alt="java reflection course" width="500"/>

1. This will in the end **create** object of the `Car`.

<img src="anotherUseCaseForTheReflection.PNG"  alt="java reflection course" width="500"/>

1. Another usage of library like:
    - **Jackson**.
    - **Gson**.

<img src="analyzeUsingReflection.PNG"  alt="java reflection course" width="500"/>

1. These libraries will, inspect given **JSON** and analyze it. As result, it will know how to map these fields and populate these.

<img src="onlyWithFieldNames.PNG"  alt="java reflection course" width="500"/>

1. Mapping and populating is done, **solely** based on the fields!

<img src="jacksonParsing.PNG"  alt="java reflection course" width="500"/>

1. **JSON** string to parse from.
2. In code, we can simply **parse** given **JSON** by simply, as giving parser the `json` and the **class** `Person.class` and reflection will be taking care of rest of the process.

<img src="JavaObjectToJson.PNG"  alt="java reflection course" width="500"/>

1. This is also true, other way around.
    - **Java** → **JSON** using reflection.

<img src="otherUserCasesForTheReflection.PNG"  alt="java reflection course" width="500"/>

1. There are many other cases for the **Java reflection**.

2. We can even use this as **tool** for **architecting** the application!

<img src="reflectionChallanges.PNG"  alt="java reflection course" width="500"/>

1. While using **reflection**, we introduce multiple dangerous situations if not careful!
    - Making the code harder to maintain!
    - Slower to run!
    - Dangerous to execute!
- We can **crush** our application unrecoverably!
2. **Reflection** is reserved for the **most skilled developers** only. 

<img src="greatPowerComesWithGreatResponsively.jpeg"  alt="java reflection course" width="500"/>

- The **Challenge** is using this **superpower**!

<img src="roadmapForReflection.PNG"  alt="java reflection course" width="500"/>

1. Nice **Michael**, I lack this intuition!!! Give me the POWER to overcome this fear!!! 

<img src="summary.PNG"  alt="java reflection course" width="500"/>

# Reflection API Gateway & Wildcards.  

<img src="WeWillFigureOut.PNG"  alt="java reflection course" width="500"/>

- Todo check this. 

<img src="EntryPointJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. You can get **much** information out of this `Class<?>` reflection mechanism, such as these. 
    - How are we getting **Object** of `Class<?>`.

- There are three ways to get **Object** of `Class<?>`.

- The **first** way to get:

<img src="oneWayToGetObjectOfClass.PNG"  alt="java reflection course" width="500"/>

1. Getting **Class** method of the **Object** instance. Example using `Object.getClass()`.

<img src="objectGetClass.PNG"  alt="java reflection course" width="500"/>

1.
2.
3.

- Todo check this one.

- The **second** way to get:

<img src="secondWayToGetObjectOfClass.PNG"  alt="java reflection course" width="500"/>

1. Getting **Class** method of the **Object** instance. Example using `.class` suffix to a type name.

<img src="dotClass.PNG"  alt="java reflection course" width="500"/>

1. We want to get **Class** information of **particular type**, **without the class instance**.

- Todo check this one.

- [WildCards](https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html).
# Reflection API Gateway in Practice.  

IDE Information Plugin - Class Analysis.  
# Solution - IDE Information Plugin - Class Analysis.  
Reflection, Interfaces and Basic Recursion.
Solution - Reflection, Interfaces and Recursion.