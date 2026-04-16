package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo
{
    public static void main( String[] args )
    {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(5);
        sortedSet.add(10);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(3);
        sortedSet.add(7);
        System.out.println(sortedSet);


    }
}
