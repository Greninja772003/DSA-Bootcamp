package collectionFrameworks;

import java.util.Map;
import java.util.TreeMap;

public class mapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A", 1, "B", 2, "C", 3, "d"));
        tm.put(7, "G");
        tm.put(4,"S");
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(5).getValue());
    }
}
