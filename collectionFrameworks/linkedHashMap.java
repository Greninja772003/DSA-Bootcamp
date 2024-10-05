package collectionFrameworks;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size()>5;
            }
        };
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");
        lhm.put(9, "I");
        lhm.put(8,"H");
        System.out.println(lhm.get(6));
        System.out.println(lhm.get(4));
        lhm.forEach((k,v)-> System.out.println(k + " -> "+ v));
    }
}
