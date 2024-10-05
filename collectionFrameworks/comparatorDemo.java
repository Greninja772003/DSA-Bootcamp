package collectionFrameworks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class comp implements Comparator<Integer>{
    public int compare(Integer n1,Integer n2){
        if (n1<n2){
            return 1;
        } else if (n1>n2) {
            return -1;
        }
        return 0;
    }
}
public class comparatorDemo {
    public static void main(String[] args) {
        Integer[] a= {1,2,3,4,5,6,7};
        Integer[] s= {1,2,3,4,5,6,7};
        Arrays.sort(a,new comp());
        System.out.println(Arrays.compare(a,s));
        Integer[] d =Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(d));
//        Arrays.fill(d,7);
//        for (int x : d) {
//            System.out.println(x);
//        }
       
    }
}
