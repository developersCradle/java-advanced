package com.learnJava.functionalInterfaces;

public class FunctionExample1 {

    public static String appendDefault(String input)
    {
        return FunctionExamples.addSomeString.apply(input);
    }

    public static void main(String[] args) {
        String result = appendDefault("Hello");
        System.out.println(result);
    }

}