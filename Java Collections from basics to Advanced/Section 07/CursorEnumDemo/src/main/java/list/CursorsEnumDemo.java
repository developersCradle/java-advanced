package list;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo
{
    public static void main( String[] args )
    {
        Vector v = new Vector();
        System.out.println("Enter the elements: ");

        for (int i = 0; i < 8; i++) {
            Scanner s = new Scanner(System.in);
            Integer data = s.nextInt();
            v.addElement(data);
        }

        System.out.println("Vector : " + v);

        Enumeration elements = v.elements();

        while (elements.hasMoreElements())
        {
//            Interger element = (Interger) elements.nextElement();
        }
    }
}
