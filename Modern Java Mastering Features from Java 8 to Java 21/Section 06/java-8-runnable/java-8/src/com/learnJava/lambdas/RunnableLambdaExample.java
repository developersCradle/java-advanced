package com.learnJava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda

        // ()->{};

        Runnable runnableUsingLambda = () -> {
            System.out.println("Some Runnable using lambda expression!");
        };


        new Thread(runnableUsingLambda).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1");
            }
        });

        new Thread(()-> System.out.println("Inside Runnable 4")).start();




    }
}
