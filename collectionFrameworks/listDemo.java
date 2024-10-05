package collectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listDemo {
    public static void main(String[] args) {
        ArrayList<Integer> as = new ArrayList<>(3);
        ArrayList<Integer> asd = new ArrayList<>(List.of(23,54,64,2,6,3,4));
        as.add(12);
        as.add(0,6);
        System.out.println(as);
        as.addAll(0,asd);
        System.out.println(as);
        System.out.println(as.contains(12));
        System.out.println(as.get(5));
        System.out.println(as.indexOf(6));
        System.out.println(as.lastIndexOf(6));
//        for (Integer a : as) System.out.println(a);
//        ListIterator it = as.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        as.forEach(System.out::println);
        as.forEach(n->show(n));
    }
    static  void show(int n){
        if (n>30)
            System.out.println(n);
    }
}
