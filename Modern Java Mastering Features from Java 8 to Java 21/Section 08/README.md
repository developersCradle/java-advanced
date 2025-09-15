# Section 08: Constructor and Method References. 

Constructor and Method References.


# What I learned.

# Method Reference.

<div align="center">
    <img src="methodReference.PNG"  alt="java advanced" width="500"/>
</div>

1. **Method reference** got introduced in **Java 8** and this tries to **simplify** the implementations **Functional Interface**.
    - This tries to **simplify** the **Lambda expressions** itself.
2. **Method reference** is having shortcut called as **Lambda Expression**.

3. This will refer **method** in a **class**.

<div align="center">
    <img src="syntaxForMethodRerence.PNG"  alt="java advanced" width="500"/>
</div>

1. The **Left** side refers to the **Class**.
2. The **Right** side refers to the **Method name**.s

<div align="center">
    <img src="whereToUseMethodReference.PNG"  alt="java advanced" width="500"/>
</div>

1. This needs to be referred to the **method directly**.
    - Using **Lambda**: `(s) -> s.toUpperCase();`.
    - Using **Method Reference**: `String::toUpperCase;`.

> [!NOTE]
> **Methods Reference** is not applicable for every case.

<div align="center">
    <img src="methodReferenceNotAcceptable.PNG"  alt="java advanced" width="500"/>
</div>

1. In example, there are **two** things which this function does. So **not** possible.
    - There is **work around**.

# Lab: Method Reference - Function.  

# Lab: Method Reference - Consumer.

# Lab: Refactor Lambda Expression to Method Reference.

# Constructor Reference.

