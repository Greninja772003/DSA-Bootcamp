package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr = {-651, -564, 6514, 1, 354, 615};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped;
//        run the steps n-1 times
        for (int i = 0; i<arr.length; i++){
            swapped = false;
//            for each step, max item will come at the respective last index
            for (int j = 1; j <arr.length-1; j++) {
//                swap if the itme is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;

                }
            }
            if (!swapped){
                break;
            }
        }




 }

}
