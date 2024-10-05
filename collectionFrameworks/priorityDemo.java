package collectionFrameworks;

import java.util.PriorityQueue;

public class priorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> obj = new PriorityQueue<>();
        obj.add(30);
        obj.add(15);
        obj.add(84);
        obj.add(56);
        obj.add(7);
        obj.add(12);
        System.out.println(obj);
        System.out.println(obj.peek());
        obj.forEach((x)-> System.out.println(x));
        obj.poll();
        System.out.println(obj);

    }
}
