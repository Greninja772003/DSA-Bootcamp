package Arrays;

public class studentChallenge1 {
    public static void main(String[] args) {
        System.out.println("Finding sum of all elements");
        int []arr = {3,4,5,2,56,646,543,323,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements in the array: "+ sum);
        System.out.println(" ");
        System.out.println("Searching an element");
        int []arr1 = {3,4,5,2,56,646,56,543,323,5};
        int target = 56;
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(target==arr1[i]){
               ++count;
               index = i;
            }
        }
        if (count>0) System.out.println("Element is found at index "+ index);
        System.out.println(" ");
        System.out.println("Finding largest and second largest element");
        int []arr2 = {3,4,5,2,56,646,56,543,323,5};
        int max = arr2[0];
        int secondLargest = arr2[0];
        for (int x:arr2) {
            if(max<x){
                max=x;
            }
        }
        for (int x:arr2) {
                if (x<max) {
                   if(secondLargest<x){
                       secondLargest=x;
                   }
                }
            }
        System.out.println("largest element in the array is: "+ max);
        System.out.println("Second largest element in the array is: " + secondLargest);

    }
}
