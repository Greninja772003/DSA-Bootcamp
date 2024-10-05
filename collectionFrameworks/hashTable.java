package collectionFrameworks;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(ht);
        ht.compute(2,(k,v)-> v+"Z");
        System.out.println(ht);
    }
}
