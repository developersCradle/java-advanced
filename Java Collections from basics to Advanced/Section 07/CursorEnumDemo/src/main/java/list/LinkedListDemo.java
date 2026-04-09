package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
    public static void main( String[] args )
    {
        // First way creating LinkedList
        LinkedList l = new LinkedList();

        // Other way creating LinkedList
        // LinkedList ll =  new LinkedList(Collection c);

        // Adding to LinkedList.
        l.add("John");
        l.add(2);
        l.add(null);
        System.out.println(l);

        // This will add with replace.
        l.set(1,13);
        System.out.println(l);

        // Adds and shifts the value if there exists!
        l.add(2,true);
        System.out.println(l);

        // Remove Last!
        l.removeLast();
        System.out.println(l);

        // Adding First!
        l.addFirst(23);
        System.out.println(l);
    }
}
