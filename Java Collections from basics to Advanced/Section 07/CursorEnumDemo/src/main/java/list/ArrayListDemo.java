package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{
    public static void main( String[] args )
    {
        // ArrayList default 10 will get created!
        ArrayList al = new ArrayList();
        // Other Syntax to use ArrayList.
        List alSecond = new ArrayList();

        // ArrayList of given size 30.
        ArrayList aList = new ArrayList(30);

        // We can initialize the, with the Collection.
        // ArrayList aList1 = new ArrayList(Collection c);


        // Adding element
        al.add("Johnn");
        al.add(true);
        al.add(10);
        System.out.println(al);

        // Remove element
        al.remove(true);
        System.out.println(al);

        // Get specific element from ArrayList!
        System.out.println(al.get(1));

        // You can see there is multiple methods in ArrayList!

    }
}
