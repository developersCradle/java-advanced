package collection;

import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo
{
    public static void main( String[] args )
    {
        // Legacy object and with the Enumeration!
        
        Vector v = new Vector();
        System.out.println("Enter the elements :");

        for (int i = 0; i < 8; i++) {
            Scanner s = new Scanner(System.in);
            Integer data = s.nextInt();
            v.add(data);
            // add stuff here
        }
    }
}
