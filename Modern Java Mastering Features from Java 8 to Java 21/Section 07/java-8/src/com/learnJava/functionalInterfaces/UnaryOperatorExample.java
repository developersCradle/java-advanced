package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (string) -> string.toUpperCase();

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("is this lower?"));
    }
}