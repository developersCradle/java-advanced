package list;

import java.util.Vector;

public class VectorDemo
{
    public static void main( String[] args )
    {
        // Vector initialized, different ways!
        Vector v = new Vector();
        Vector vec = new Vector(60);
        // Avoid wasting memory, we have another way to initialize this:
        Vector vec1 = new Vector(100, 5); // Just grow 5.
        // We get vector to equal to this!
        // Vector vec2 = new Vector(Collection c)

        // Add to vector!
        v.add(10); // From collection
        v.addElement("Hello"); //From Vector
        System.out.println(v);
        // Removing from vector!
        v.remove(0);
        System.out.println(v);
    }
}
