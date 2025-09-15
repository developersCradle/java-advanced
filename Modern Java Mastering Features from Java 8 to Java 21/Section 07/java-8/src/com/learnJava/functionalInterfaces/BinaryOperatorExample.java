package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;

    public static void main(String[] args) {

        System.out.println(binaryOperator.apply(1,2));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy is : " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of MinBy is : " + minBy.apply(4,5));
    }
}