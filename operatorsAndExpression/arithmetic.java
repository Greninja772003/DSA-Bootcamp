package operatorsAndExpression;

import org.w3c.dom.ls.LSOutput;

public class arithmetic {
    public static void main(String[] args) {
        int a=14, b=115;
        float c =(float) b/a;
        int r = b%a;
        System.out.println("divide = " + c);
        System.out.println("modulus = " + r);

        byte var1 = 84;
        short var2 = 84;
        int ans = var1 + var2;

        float var3 = 93.53f;
        int var4 = 984;
        float ans1 = var3 * var4;

        char var5 = 43;
        int var6 = 53;
        int ans2 = var5-var6;
        System.out.println(10 + 20 /2);
        System.out.println((10+20)/2);
        System.out.println(10/2*5);
        System.out.println(10/(2 *5));

        arithmetic obj = new arithmetic();

    }
}
