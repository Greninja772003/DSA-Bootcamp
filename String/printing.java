package String;

import java.util.Arrays;

public class printing {
    public static void main(String[] args) {
        int x = 38, y = 94;
        float s = 34.659926f;
        char z = 'E';
        boolean tru = true;
        String str = "java";
        System.out.println(x+s+" ankur here"); //this is called concatenation x and s sum value has written with string
        System.out.println("ankur here " + s + x);
        System.out.println("ankur here " + (s + x));
        System.out.println("sum of " + x + " and " + y + " is: " + (x + s));

        System.out.printf("hello %x %g %c World\n", x, s ,z);
        System.out.printf("hello %s\n" ,str);

        System.out.printf("%1$d %2$d %3$e\n", x, y,s);
        System.out.printf("%3$s %1$d %2$f\n", x, s, str);

        System.out.printf("%5d\n",x);
        System.out.printf("%05d\n",x);
        System.out.printf("%6.2f\n",s);
        System.out.format("%20s",str);

    }
}
