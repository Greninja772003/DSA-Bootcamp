package Loops;

public class studentChallenge6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i<=j){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=5; j++) {
                if (i<=j){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 9; i >= 1; i = i-2) {
            for (int j = 1; j <=9; j++) {
                if (i<=j){
                    System.out.print("* ");
                }else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
