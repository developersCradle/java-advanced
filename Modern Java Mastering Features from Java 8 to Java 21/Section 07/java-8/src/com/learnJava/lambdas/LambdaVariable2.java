package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {

         int value = 4; // Effectively final.

        Consumer<Integer> c1 = (a) -> {
            // Continue this form the Java Advanced todo heikki.
            value = 6;
            //  System.out.println(i+value);
        };
        // value =2;

        c1.accept(2);
    }
}