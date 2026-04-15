package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class HashSetDemo
{
    public static void main( String[] args )
    {
        // Only way to create HashSet !
        HashSet hashset = new HashSet(); // Initial capacity = 16.
        HashSet hashset1 = new HashSet(30);// Initial capacity = 30.
        // Load factor, at what is the factor when it would change!
        // We can provide also, the load factor!
        HashSet hashset3 = new HashSet(100, .80f);
        // When 80% of the old HashSet is full, the new HasSet size will be 200! The left over HashSet is for the gc to collect!

        // We can initialize this with Collection!
        ArrayList l = new ArrayList();
        HashSet hashset4 = new HashSet(l);



    }
}
