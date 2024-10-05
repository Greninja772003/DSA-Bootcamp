package collectionFrameworks;

import java.util.HashSet;

public class hashSetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>(20,0.25f);
        hs.add(10);
        hs.add(39);
        hs.add(94);
        hs.add(10);
        System.out.println(hs);
    }
}
