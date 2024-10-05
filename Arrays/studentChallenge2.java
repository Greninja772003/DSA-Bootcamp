package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Rotating an array");
        int[] arr = {12, 2, 4, 98, 351, 214, 15, 97};
        System.out.println("Array before rotation: " + Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
            arr2[j] = arr[i];
        }
        System.out.println("Array after rotation: " + Arrays.toString(arr2));

        System.out.println(" ");

        System.out.println("Rotating an element in an array");
        System.out.println("Array before element rotation: " + Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Array after element rotation: " + Arrays.toString(arr));

        System.out.println(" ");

        System.out.println("Inserting and deleting an element in an array");
        System.out.println("Enter the element you want to search in the array:");
        int target = in.nextInt();
        System.out.println("Enter the index at which you want ot delete the element of the array:");
        int targetIndex = in.nextInt();
        int[] arr4 = new int[10];
        arr4[0] = 23;
        arr4[1] = 3;
        arr4[2] = 453;
        arr4[3] = 12;
        arr4[4] = 9;
        arr4[5] = 243;
        System.out.println("Array before inserting any element: " + Arrays.toString(arr4));
        for (int i = arr4.length - 1; i > 1; i--) {
            arr4[i] = arr4[i - 1];
        }
        arr4[2] = target;
        System.out.println("Array after inserting target element at index 2: " + Arrays.toString(arr4));
        System.out.println("Array before deleting any element: "+Arrays.toString(arr4));
//        arr4[targetIndex] = 0;
        for (int i = targetIndex; i <arr4.length-1 ; i++) {
            arr4[i]= arr4[i+1];
        }
        System.out.println("Array after deleting an element at a particular index: "+Arrays.toString(arr4));
    }
}
