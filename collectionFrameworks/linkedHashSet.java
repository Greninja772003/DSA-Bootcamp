package collectionFrameworks;

import java.util.*;

public class linkedHashSet {
    public static void main(String[] args) {
        HashSet<String> lhs = new HashSet<>(10);
        lhs.add("a");
        lhs.add("f");
        lhs.add("y");
        lhs.add("w");
        lhs.add("j");
        Iterator<String>it =lhs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
  }
