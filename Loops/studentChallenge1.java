package Loops;

import java.util.Scanner;

public class studentChallenge1 {
    public static void main(String[] args) {
        System.out.println("Display Multiplication Table");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table you want: ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        //**************************************************************************************************************
        System.out.println("Find Sum of n Numbers");
        System.out.println("Enter a random number");
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + number + " numbers is: " + sum);
//**************************************************************************************************************
        System.out.println("Factorial of a number");
        System.out.println("Enter a random number");
        int var = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i<=var ; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + var + " is: " + factorial);
    }
}
