# Section 09: Lambdas and Local variables (Effectively Final). 

Lambdas and Local variables (Effectively Final).

# What I Learned.

# Lab : Local Variables in Lambda Expression.

<div align="center">
    <img src="lambdasAndLocalVariables.PNG"  alt="java advanced" width="500"/>
</div>


1. **Local Variables**
    - **Variable** declared inside method.
2. As summary **Lambda Expression**, has **two** restrictions:
    - The Fist **Restriction** example:
    ````
    public static void main(String[] args) {

        int i=0; // Repeated variable name not allowed.
         Consumer<Integer> c1 = (i) -> {
//        Consumer<Integer> c1 = (a) -> {
            //int i=0;
            System.out.println(i);
        };

    }
    ````


