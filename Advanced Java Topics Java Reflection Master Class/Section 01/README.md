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

<img src="EntryPointJavaReflection.PNG"  alt="java reflection course" width="500"/>

1. You can get **much** information out of this `Class<?>` reflection mechanism, such as these. We can get following information from **Reflection Entry Point**
    - What methods and fields it contains.
    - What classes it extends.
    - What interfaces it implements.
    
- There are three ways to get **Object** of `Class<?>`❗

- The **first** way to get Object instance:

<img src="oneWayToGetObjectOfClass.PNG"  alt="java reflection course" width="500"/>

1. Getting **Class object** using method of the **Object** instance. Example using `Object.getClass()`.
    - Reference document [.GetClass](https://docs.oracle.com/javase/tutorial/reflect/class/classNew.html).

<img src="objectGetClass.PNG"  alt="java reflection course" width="500"/>

- We can get their respected **runtime type** of the given `Class<?>`. 

1. We have **Class object** that represents the **String** type. Example:
    - Setting the variable: `String stringObject = "some-string";`. 
    - Getting the reference with the `Class<String> stringClass = stringObject.getClass();`
2. We have the **Class object** that represents the **Car** class.
    - Setting the variable: `Car car = new Car();`. 
    - Getting the reference with the `Class<Car> carClass = car.getClass();`.
3. We have **Class** object referring the **HashMap** type.
    - Setting the variable: `Map<String, Integer> map = new HashMap<>();`.
    - Getting the reference with the `Class<?> mapClass = map.getClass(); // returns HashMap class`
        - Notice this will point to the **Hash Map** and not the **interface type**❗

<img src="getClassForThePrimitiveTypes.PNG"  alt="java reflection course" width="500"/>

1. There is no way to get `.getClass()` for the ❌**primitive type**❌.
    - **Primitive types** don't **inherit** from the **Object class**.

- The **second** way to get, to get **class object** is to type `.class` after **type name**:

<img src="secondWayToGetObjectOfClass.PNG"  alt="java reflection course" width="500"/>

1. Getting **Class** method of the **Object** instance. Example using `.class` suffix to a type name.

<img src="dotClass.PNG"  alt="java reflection course" width="500"/>

1. We want to get **Class object** information of **particular type**, **without the class instance**.

- Example of getting the **Class information**, without having **instance** of the given type.

````
Class<String> stringClass = String.class;
Class<Car> carClass = Car.class;
Class<?> mapClass = HashMap.class;
````

<img src="dotClassOfThePrimitiveType.PNG"  alt="java reflection course" width="500"/>

1. We can get information of the **primitive types**, with the following technique. `primitiveTypeHere` and as **prefix** `.class`!

- Example below:

```
Class booleanType = boolean.class;

Class intType = int.class;

Class doubleType = double.class;

class MyClass {
    private int value;

    public boolean isNegative(float x) {
    // Code come here.
    }
}
```

<img src="TheThirdWayToGetClassInformation.PNG"  alt="java reflection course" width="500"/>


1. The **third way** to get **Class information** is to call the `Class.froName()`.
    - We are retrieving **dynamically** the **Class information** from the `classpath`, with **fully qualified class name**!

<img src="staticForName.PNG"  alt="java reflection course" width="500"/>

1. We can access, own **classes** or the **interfaces**.
2. Even **internal classes**.

<img src="static.forNameNotForThePrimitiveType.PNG"  alt="java reflection course" width="500"/>

1. Still we cannot get the **primitive type**.
    - We will get **RUNTIME ERROR** instead of **COMPILATION ERROR**

<img src="notesClassForName.PNG"  alt="java reflection course" width="500"/>

1. With the `Class.forName()`, we are more prone for getting the **Exception**, since it's written as parameter.
2. **There** at least one good use case, it is when using **configuration**.

<img src="classDotForNameInConfiguration.PNG"  alt="java reflection course" width="500"/>

1. We are reading using **reflection** from the **config file**.


- This can be **very** useful, when the **Class** is not available in the **Runtime**.

<img src="secondExampleUsingForName.PNG"  alt="java reflection course" width="500"/>

1. Such as **external** libraries, which are injected to the **class path** at **run time**!

<img src="externalInjection.gif"  alt="java reflection course" width="500"/>

> [!TIP]
> Remember the **SuperClass** is the **parent** class.

<img src="javaWildCards.PNG"  alt="java reflection course" width="500"/>

1. In **Java** the **Integer** extends **Number** and
**String** implements **CharSequence**.
2. `List<Number>` is **not** super class of the `List<Integer>`.
3. `List<CharSequence>` is **not** super class of the `List<String>`.

<img src="javaWildCardsExtends.PNG"  alt="java reflection course" width="500"/>

1. **HOWEVER!**, The `List<?>` is **Java wildcard** and its super type of **any generic type**!
    - [Wildcards](https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html).

<img src="javaWildCardsExtendsSecond.PNG"  alt="java reflection course" width="500"/>

1. `List<?>` is super class of any `List<T>`, of any **T** type!

<img src="classGenerilization.PNG"  alt="java reflection course" width="500"/>

1. We can follow this logic and make it so, that `Class<?>` is **super class** of any class of the `Class<T>` of any type of **T**!


<img src="classGenerilization.PNG"  alt="java reflection course" width="500"/>



# Reflection API Gateway in Practice.  

IDE Information Plugin - Class Analysis.  
# Solution - IDE Information Plugin - Class Analysis.  
Reflection, Interfaces and Basic Recursion.
Solution - Reflection, Interfaces and Recursion.





