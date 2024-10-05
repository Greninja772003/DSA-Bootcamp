package collectionFrameworks;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        LinkedList<Integer> asd = new LinkedList<>(List.of(3,54,23,7,86));
        obj.add(97);
        obj.add(0,5);
        obj.addAll(asd);
        System.out.println(obj);
        obj.set(3,55);
        System.out.println(obj);
        obj.addFirst(1);
        obj.addLast(94);
        System.out.println(obj);
    }
}
