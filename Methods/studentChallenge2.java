package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
        System.out.println("Overloaded method to calculate area");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the shape whose area you want ot calculate: ");
        String str = in.nextLine();
        switch (str) {
            case "circle": {
                System.out.println("Enter the radius of circle:");
                int rad = in.nextInt();
                System.out.println("Area of circle is: " + area(rad));
            }
            break;
            case "triangle": {
                System.out.println("Enter the three parameters of triangle:");
                double cons = in.nextDouble();
                int base = in.nextInt();
                int height = in.nextInt();
                System.out.println("Area of triangle is: " + area(cons, base, height));
            }
            break;
            case "rectangle": {
                System.out.println("Enter the length and breath of rectangle:");
                int length = in.nextInt();
                int breath = in.nextInt();
                System.out.println("Area of rectangle is: " + area(length, breath));
            }
            break;
            default:
                System.out.println("Invalid shape");
        }
        System.out.println(" ");
        System.out.println("Overload method to reverse a array");
        int[] arr = {34, 646, 34, 5, 5, 545, 43, 5, 3, 65, 67, 98};
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array after reverse: " + Arrays.toString(arr));
        int n = 3984;
        System.out.println("Number before reverse " + n);
        System.out.println("Number after reverse " + reverse(n));
        System.out.println(" ");
        System.out.println("Overload method to validate name age");
        System.out.println("Does 'ankur' is a valid name: "+ validate("virat"));
        System.out.println("Does '20' is a valid age: "+ validate(20));
    }
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=3&&age<=15;
    }
    static void reverse(int[] arr) {
        int[] arr2 = {34, 646, 34, 5, 5, 545, 43, 5, 3, 65, 67, 98};
        for (int i = 0, j = arr2.length - 1; i < arr.length && j >= 0; i++, j--) {
            arr[i] = arr2[j];
        }
    }

    static int reverse(int n) {
        int rev = 0;
        while (n>0){
            int rem = n%10;
            n=n/10;
            rev = rev*10 + rem;
        }
        return rev;
    }

    static int area(int rad) {
        int area = (22 / 7) * rad * rad;
        return area;
    }

    static double area(double cons, int base, int height) {
        double area = cons * base * height;
        return area;
    }

    static int area(int length, int breath) {
        int area = length * breath;
        return area;
    }
}
