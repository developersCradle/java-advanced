# Section 04: Collection Framework. 

Collection Framework.

# What I Learned.

# Collection Framework.

<div align="center">
    <img src="Collection_Framework.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. We will be going thought the **Collection Framework**!

<div align="center">
    <img src="Collection_As_Defined.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. **Collection** is group of **discrete** object in the single units!

<div align="center">
    <img src="Collection_Framework_Includes.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. It will hold **interfaces** and implementations of the **classes** and **Algorithms** to solve the programmers problems!

<div align="center">
    <img src="Collection_Hierarchy.JPG"  alt="Java Collections from basics to Advanced Course!" width="600"/>
</div>

0. **Collection** came part of **Java** from the version `1.2` **JDK**.
1. Group of objects in single entity, where **List** can have **duplicates**! The **inserting order** is **preserved**!
2. There are other **subtypes** of the implemented classes!
    - `ArrayList`.
    - `Linked List`.
    - `Vector` **(legacy)**.
3. Group of objects in single entity, **Set** cannot have **duplicates** and the inserted **order** is **not preserved**!
4. There are other **subtypes** of the implemented classes!
    - `HashSet`.
    - `Linked HashSet`.
5. There is another interface, which implements the `set` interface, it's called `sorted set`.
    - This will **preserve order**!
    - This has the still the `set` characteristics, where there are **no** **duplicates**! 
6. `Navigatble Set` is interface and the `TreeSet` is the implementation of this class!
    - Again, this will have **order preserved** and there are **no** **duplicates** and **navigation methods** for ease of use.
7. Group of objects in single entity, **Queue** is presenting items prior to processing!
    - **FIFO**, Queue **preserves order**, but can be processed in a certain order and can have **duplicates**!
8. Implementations of the **Queue** interface:
    - `PriorityQueue`.
    - `BlockingQueue`.
    - `LinkedBlockingQueue`.
    - `PriorityBlockingQueue`.
9. **Vector** and **Stack** are considered **Legacy Classes** in Java.
    - While they are still part of the Java language (for backward compatibility), they were designed before the official Collections Framework (**JDK 1.2**) existed.

> [!IMPORTANT]
> Note these **6** interfaces described are representing discrete objects as **single** unit! 



> [!IMPORTANT]
> Note these **Map** describing object in **key-value** pairs!
