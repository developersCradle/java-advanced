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

<hr>

<div align="center">
    <img src="introductionToOptionals.PNG"  alt="java advanced" width="500"/>
</div>




