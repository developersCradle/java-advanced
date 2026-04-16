package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main( String[] args ) {
        // Different ways to initialize the LinkedHashSet.
        LinkedHashSet lks = new LinkedHashSet();
        LinkedHashSet lhs1 =  new LinkedHashSet(30);
        LinkedHashSet lhs2 =  new LinkedHashSet(20, 1.00f); // When LinkedHashSet is full!
        // Insertion order is preserved!
    }
}
