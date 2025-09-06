package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {return  i%2 ==0;};

    static Predicate<Integer> p1 = (i) -> i%2 ==0;

    static Predicate<Integer> p2 = (i) -> i%5 ==0;


    public static void predicateAnd(){

        System.out.println("Result in predicateAnd, this example we will use the 10: " + p1.and (p2).test(10));
        System.out.println("You can see that, the 10 is divisible by 2 and is divisible by 5.");
        System.out.println("Result in predicateAnd, this example we will use the 12: " + p1.and (p2).test(12));
        System.out.println("You can see that, the 12 is divisible by 2, but not the 5.");
    }

    public static void predicateOr(){

        System.out.println("Predicate OR result is : " + p1.or(p2).test(10));
        System.out.println("Predicate OR result is : " + p1.or(p2).test(9));
    }

    public static void predicateNegate(){

        System.out.println("Result in predicateNegate : " + p1.and(p2).negate().test(4)); //equivalent to reversing the result
    }


    public static void main(String[] args) {

        System.out.println("Result is p : " + p.test(2));

        System.out.println("Result is p1 : " + p1.test(3));

//        predicateAnd();

        predicateOr();

//        predicateNegate();

    }


}