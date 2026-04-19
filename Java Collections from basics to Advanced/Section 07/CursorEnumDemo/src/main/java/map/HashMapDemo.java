package map;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main( String[] args ) {

        // We will be populating this HashMap!
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("Science", 90);
        hashMap.put("Math", 80);
        hashMap.put("English", 90);

        System.out.println(hashMap);

    }
}
