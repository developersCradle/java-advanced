package list;

import java.util.Stack;

public class StackDemo
{
    public static void main( String[] args )
    {
        // Only way to create stack!
        Stack stack = new Stack();

        // Adding to stack.
        stack.push(10);
        stack.push(30);
        stack.push(true);
        System.out.println("Printing stack:");
        System.out.println(stack);

        // Popping from stack.
        System.out.println("Popping element:");
        Object popped = stack.pop(); // Pop get first from stack!
        System.out.println(stack);

        System.out.println("Peek element:");
        Object peek = stack.peek(); // Peek, Look at the top element of the stack without removing it!
        System.out.println(peek);
        System.out.println("Printing the stack:");
        System.out.println(stack);
        System.out.println("Searching in the stack:");
        System.out.println(stack.search(10)); // Searches where the "2" is.
        // Two from top!



    }
}
