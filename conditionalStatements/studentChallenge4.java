package conditionalStatements;

import java.util.Scanner;

public class studentChallenge4 {
    public static void main(String[] args) {
        System.out.println("Display name of a month based on number");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Month number:");
        int month = in.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month Numbers");
        }
        //**************************************************************************************************************
        System.out.println("Display type of website");
        System.out.println("Enter the url of website:");
        String website = in.next();
        int lastDot = website.lastIndexOf(".");
        String webType = website.substring(lastDot,website.length());
        switch (webType){
            case ".com":
                System.out.println("It is a Commercial Website");
                break;
            case ".org":
                System.out.println("It is an Organizational Website");
                break;
            case ".net":
                System.out.println("It is a Networking Website");
                break;
            case ".gov":
                System.out.println("It is a Government Website");
                break;
            default:
                System.out.println("Invalid type of Website");
        }
    }
}
