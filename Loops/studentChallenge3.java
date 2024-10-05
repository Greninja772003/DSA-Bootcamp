package Loops;

import java.util.Scanner;

public class studentChallenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Display AP series");
        System.out.println("Enter the first element:");
        int var = in.nextInt();
        System.out.println("Enter the common difference:");
        int diff = in.nextInt();
        System.out.println("Enter the number of terms in series:");
        int terms =  in.nextInt();
        int series = var;
        while(terms>0){
            System.out.print(series + ",");
            series  = series+diff;
            terms--;
        }
        //**************************************************************************************************************
        System.out.println("\nDisplay GP series");
        System.out.println("Enter the first element:");
        int var1 = in.nextInt();
        System.out.println("Enter the common dividend:");
        int div = in.nextInt();
        System.out.println("Enter the number of terms in series:");
        int terms1 =  in.nextInt();
        int series1 = var1;
        while(terms1>0){
            System.out.print(series1 + " , ");
            series1 = series1*div;
            terms1--;
        }
        //**************************************************************************************************************
        System.out.println("\nDisplay fibonacci series");
        System.out.println("Enter first two numbers");
        int var2 = in.nextInt(),  var3 = in.nextInt();
        System.out.println("Enter the number of terms in series:");
        int terms2 =  in.nextInt();
        System.out.print(var2 + ", " + var3 + ", ");
        for (int i = 0; i < (terms2-2); i++) {
            int fiboSeries = var2+var3;
            System.out.print(fiboSeries + ", ");
            var2 = var3;
            var3 = fiboSeries;
        }
    }
}
