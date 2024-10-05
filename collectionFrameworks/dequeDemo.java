package collectionFrameworks;

import java.util.ArrayDeque;

public class dequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> obj = new ArrayDeque<>();
        obj.offerLast(10);
        obj.offerLast(20);
        obj.offerLast(30);
        obj.offerLast(40);
        obj.forEach((x)-> System.out.println(x));
        obj.offerFirst(1);
        obj.offerFirst(3);
        obj.offerFirst(5);
        obj.offerFirst(8);
        System.out.println(obj);
        obj.pollFirst();
    }
}
