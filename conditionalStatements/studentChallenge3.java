package conditionalStatements;

import java.util.Scanner;

public class studentChallenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Display name of a day based on number");
        System.out.println("Enter the day number");
        int day = in.nextInt();
        switch (day) {
            case 1:
                if (day == 1) {
                    System.out.println("It is Sunday");
                }
            case 2:
                if (day == 2) {
                    System.out.println("It is Monday");
                }
            case 3:
                if (day == 3) {
                    System.out.println("It is Tuesday");
                }
            case 4:
                if (day == 4) {
                    System.out.println("It is Wednesday");
                }
            case 5:
                if (day == 5) {
                    System.out.println("It is Thursday");
                }
            case 6:
                if (day == 6) {
                    System.out.println("It is Friday");
                }
            case 7:
                if (day == 7) {
                    System.out.println("It is Saturday\n");
                }
        }
//*********************************************************************************************************************
        System.out.println("Find type of website and the protocol used");
        String website = "https://wwww.google.com";
//        System.out.println("Index of '.' in the website string: "+ website.indexOf(":"));
        String protocol = website.substring(0, 5);
        if (protocol.equals("https")) {
            System.out.println("The protocol is Hyper Text Transfer Protocol");
        } else System.out.println("The protocol is File transfer Protocol");
//        System.out.println("last index of '.' in the website string: "+ website.lastIndexOf("."));
        String web = website.substring(20, website.length());
        if (web.equals("com")) {
            System.out.println("It is a Commercial Website");
        } else if (web.equals("org")) {
            System.out.println("It is a Organizational Website");
        } else System.out.println("It is a Networking Website");
    }
}
