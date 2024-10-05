package operatorsAndExpression;

import java.util.Scanner;

public class triangleArea2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        float s;
        double area;
        System.out.println("Enter 3 sides of triangle ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        s= (a+b+c)/2f;
        area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is: " + area);
    }
}
