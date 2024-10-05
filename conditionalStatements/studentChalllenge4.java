package conditionalStatements;

import java.util.Scanner;

public class studentChalllenge4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Enter the operation you want to execute:");
        String str = in.next();
        switch (str){
            case "add":
                System.out.println("Ans is: " + (a+b));
                break;
            case "sub":
                System.out.println("Ans is: " + (a-b));
                break;
            case "multiply":
                System.out.println("Ans is: " + (a*b));
                break;
            case "divide":
                System.out.println("Ans is: " + (a/b));
                break;
            default:
                System.out.println("Invalid operation selected");
        }
    }
}
