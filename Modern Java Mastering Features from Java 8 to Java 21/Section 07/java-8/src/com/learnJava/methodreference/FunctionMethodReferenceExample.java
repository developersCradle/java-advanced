package com.learnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperCaseReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java8"));
        System.out.println(toUpperCaseReference.apply("java8"));

    }
}
