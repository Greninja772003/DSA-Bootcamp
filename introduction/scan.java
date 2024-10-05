package introduction;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your name");
//        int a = in.nextInt(), b = in.nextInt(), c;
//        c = a + b;
//        System.out.println("Sum of given two integers: " + c);
//
//        String name = in.nextLine();
//        System.out.println("Welcome " + name );

        in.useRadix(2);
        int z = in.nextInt();
        System.out.println(z);
    }
}
