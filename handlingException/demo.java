package handlingException;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Enter the integers value: ");
        Scanner in =new Scanner(System.in);
        int x= in.nextInt(), y= in.nextInt(), z;
        try {
            z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("bye");
    }
}
