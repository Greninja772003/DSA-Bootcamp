package Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,2,4,3,1,8,6,9,7,10,11};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[]arr){
        int i = 0;
        while(i <arr.length){
            int correct_index = arr[i]-1;
            if (arr[i] != arr[correct_index]){
                swap(arr, i , correct_index);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
}}

