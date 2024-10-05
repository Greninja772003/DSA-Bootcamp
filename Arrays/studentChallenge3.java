package Arrays;

import java.util.Arrays;

public class studentChallenge3 {
    public static void main(String[] args) {
        int[] arr= {23,53,4,7,58,87,96,576};
        int []arr1= new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        System.out.println("Copy an Array: " + Arrays.toString(arr1));
        for (int i = 0; i < arr.length; i++) {
            arr1[arr.length-(1+i)]=arr[i];
        }
        System.out.println("Reverse copy of an Array: "+Arrays.toString(arr1));
        int [] arr2 = {23,543,6,57,45};
        System.out.println("Initial size of the array: "+ Arrays.toString(arr2));
        int [] arr3 = new int[2*arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i]=arr2[i];
        }
        arr2= arr3;
        arr3= null;
        System.out.println("Increasing size of the array: "+Arrays.toString(arr2));
    }
}

