# Section 05: Collection and Collections.

Collection and Collections.

# What I Learned.

# Collection Interface.

<div align="center">
    <img src="Collection_Interface.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. Collection interfaces!

<div align="center">
    <img src="Collection_Interface_Bigger_Picture.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. **Collection** interface represent group of discrete objects!
    - It provides **most common** methods for its sub-classes!
2. There is **no implementation** of this interface directly!
    - It provides **sub-interfaces** like `List` in `2.1`.
    - It provides **sub-interfaces** like `Set` in `2.2`.

<div align="center">
    <img src="Common_Methods_From_Collection_Add.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. `add(...)` adds object to the collection!
2. In case of `set` this `add(...)` would return `false`.

<div align="center">
    <img src="Common_Methods_From_Collection_AddAll.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With `addAll(...)` Example, we can add `list` to another `list`!

<div align="center">
    <img src="Common_Methods_From_Collection_Remove.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With `remove(...)` **removes** the **specified** element from the collection!

<div align="center">
    <img src="Common_Methods_From_Collection_RemoveAll.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `removeAll(...)` **removes** the all which are specified. One example is to specify the **array** to be removed, from original one! 

<div align="center">
    <img src="Common_Methods_From_Collection_RetainAll.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `retainAll(...)`, **remove** the **other elements**, except the invoked ones!

<div align="center">
    <img src="Common_Methods_From_Collection_Clear.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `clear()` is clearing the **collection**.

<div align="center">
    <img src="Common_Methods_From_Collection_Contains.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `contains(...)`, returns `true` if the `obj` is **inside** the **collection**.

<div align="center">
    <img src="Common_Methods_From_Collection_ContainsAll.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `containsAll(...)`, returns `true` if the **Collection** `c` `ele1` and `ele2` is inside the **invoking collection**!

<div align="center">
    <img src="Common_Methods_From_Collection_IsEmpty.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `isEmpty(...)`, returns `true` if the **Collection** is empty! 

<div align="center">
    <img src="Common_Methods_From_Collection_Size.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `size()`, returns **size** of the **Collection**!

<div align="center">
    <img src="Common_Methods_From_Collection_Iterator.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `iterator()`, returns `Iterator`/`Cursor` for the **working collection**!

> [!NOTE]  
> *“**Cursor** is a control structure that enables traversal of records”*

<div align="center">
    <img src="Common_Methods_From_Collection_ToArray.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. With the `toArray()`, **converts** the working `Collection` into the `Array`!

# Collection vs Collections.

<div align="center">
    <img src="Collection_Vs_Collections.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

1. We will be looking what is difference between **term** `Collection` and `Collections`.

<div align="center">
    <img src="Collection_Vs_Collections_Difference.JPG"  alt="Java Collections from basics to Advanced Course!" width="500"/>
</div>

> [!NOTE]  
> **Notice** that **Collection** and **Collections** comes from `package java.util;`.

1. The `Collection` is the **interface** for **Java Collection Framework**!
2. The `Collections` is having **Util** classes, such as:
    - `sort()`.
    - `reverse()`.
    - `shuffle()`.
    - `binarySearch()`.
    - `disjoint()`.