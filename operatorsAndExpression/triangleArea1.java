package operatorsAndExpression;

import java.util.Scanner;

public class triangleArea1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base, height, area;
        System.out.println("Enter the base of triangle");
        base = in.nextFloat();
        System.out.println("Enter the height of triangle");
        height = in.nextFloat();
        area = (1f/2f)*base*height;
        System.out.println("The Area of triangle is: " + area);
    }
}
