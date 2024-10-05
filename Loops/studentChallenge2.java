package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
        System.out.println("Display digits in alphabets");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = in.next();
        String digit = "";
        for (int i = 0; i <num.length(); i++) {
            digit = String.valueOf(num.charAt(i));
            switch (digit){
                case "0":
                    System.out.printf("Zero ");
                    break;
                case "1":
                    System.out.printf("One ");
                    break;
                case "2":
                    System.out.printf("Two ");
                    break;
                case "3":
                    System.out.printf("Three ");
                    break;
                case "4":
                    System.out.printf("Four ");
                    break;
                case "5":
                    System.out.printf("Five ");
                    break;
                case "6":
                    System.out.printf("Six ");
                    break;
                case "7":
                    System.out.printf("Seven ");
                    break;
                case "8":
                    System.out.printf("Eight ");
                    break;
                case "9":
                    System.out.printf("Nine ");
                    break;
            }
        }
        //**************************************************************************************************************
        System.out.println("Display Digits");
        System.out.println("Enter a number");
        int num1 = in.nextInt();
        while(num1>0){
            int r = num1%10;
            num1= num1/10;
            System.out.println(r);
        }
        //**************************************************************************************************************
        System.out.println("Count Digits");
        System.out.println("Enter a number");
        int num2 = in.nextInt();
        int count = 0;
        while(num2>0){
           num2=  num2/10;
            count++;
        }
        System.out.println("Number of digits are: "+ count);
        //**************************************************************************************************************
        System.out.println("Check whether the number is armstrong or not");
        System.out.println("Enter a number");
        int num3 = in.nextInt();
        int var1 = num3;
        int armstrongNumber = 0;
        while(num3>0){
            int rem = num3%10;
            num3 = num3/10;
            armstrongNumber = armstrongNumber + (rem*rem*rem);
        }
        if (armstrongNumber == var1) System.out.println("It is an Armstrong number");
        else System.out.println("It is not an Armstrong number");
        //**************************************************************************************************************
        System.out.println("Reverse a Number");
        System.out.println("Enter a number");
        int num4 = in.nextInt();
        int rev = 0;
        while (num4>0){
            int rem1 = num4%10;
            num4 = num4/10;
           rev = rev*10 + rem1;
        }
        System.out.println("Reverse of the given number is: " + rev);
        //**************************************************************************************************************
        System.out.println("Check a number is palindrome");
        System.out.println("Enter a number");
        int num5 = in.nextInt();
        int var2 = num5;
        int rev2 = 0 ;
        while (num5>0){
            int rem2 = num5%10;
            num5 = num5/10;
            rev2 = rev2*10 + rem2;
        }
        if (rev2==var2){
            System.out.println("The Given number is a Palindrome");
        }else System.out.println("The given number is not a Palindrome");
    }
}
