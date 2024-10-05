package conditionalStatements;

import java.util.Scanner;

public class studentChallenge1 {
    public static void main(String[] args) {
        int num = 4;
        if(num/2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

        int age = 18;
        if (age<=24) System.out.println("Person ia young");
        else System.out.println("Person  is not young");

        Scanner in = new Scanner(System.in);
        int m1 = in.nextInt(), m2 =in.nextInt(), m3 = in.nextInt() ;
        int avg = (m1+m2+m3)/3;
        if (avg>70) System.out.println("A grade");
        else if (avg>=60 && avg<=70) {
            System.out.println("B grade");
        } else if(avg>=50 && avg<=60){
            System.out.println("C grade");
        } else if (avg>=40 && avg<=50) {
            System.out.println("D grade");
        }else {
            System.out.println("F grade");
        }
    }
}
