package operatorsAndExpression;

import java.util.Scanner;

public class quadraticEquations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of coefficients:");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        double r1, r2;
        r1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        r2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        System.out.println("Roots are " + r1 + " " + r2);
    }
}
