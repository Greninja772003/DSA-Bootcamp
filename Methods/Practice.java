package Methods;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int a=455,b=95;
        System.out.println(a);
        System.out.println(max(a,b));
        int[] arr = {3,5,6,4,5,7,34,3};
        System.out.println(Arrays.toString(arr));
        update(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int a, int b){
        ++a;
        System.out.println(a);
        return Math.max(a, b);
    }
    static  void update(int[] arr){
        arr[0]=24;
    }
}
