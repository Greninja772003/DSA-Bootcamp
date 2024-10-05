package conditionalStatements;

import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
//        Check the radix of the number
        Scanner in = new Scanner((System.in));
        System.out.println("Enter the number to check its Radix form:");
        String name = in.nextLine();
        if(name.matches("[01*]")){
            System.out.println("Number system is binary");
        }else if (name.matches("[0-7]*")){
            System.out.println("Number system is octal");
        }else if(name.matches("[0-9]*")){
            System.out.println("Number system is decimal");
        }else System.out.println("Number system is hexadecimal");

//        Check whether the year is leap year or not
        System.out.println("Enter the year for check");
        int year = in.nextInt();
        if (year%4==0){
            System.out.println("It is a leap year");
        }else System.out.println("It is not a leap year");
    }
}
