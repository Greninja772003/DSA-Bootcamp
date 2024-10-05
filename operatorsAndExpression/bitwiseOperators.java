package operatorsAndExpression;

public class bitwiseOperators {
    public static void main(String[] args) {
        //AND operation
        System.out.println("And Operation between 10 and 6: ");
        int x= 10, y = 6, z;
        z=x&y;
        System.out.println(z);

        int xx=0b1010, yy=0b0110,zz;
        zz=xx&yy;
        System.out.println(zz);
        System.out.println("Binary form of zz: " + String.format("%s",Integer.toBinaryString(zz)));


        //OR operation
        System.out.println("OR Operation between 10 and 6: ");
        int x1= 10, y1 = 6, z1;
        z1=x1|y1;
        System.out.println(z1);

        int xx1=0b1010, yy1=0b0110,zz1;
        zz1=xx1|yy1;
        System.out.println(zz1);
        System.out.println("Binary form of zz1: " + String.format("%s",Integer.toBinaryString(zz1)));

        //XOR operation
        System.out.println("XOR Operation between 10 and 6: ");
        int x2= 10, y2 = 6, z2;
        z2=x2^y2;
        System.out.println(z2);

        int xx2=0b1010, yy2=0b0110,zz2;
        zz2=xx2^yy2;
        System.out.println(zz2);
        System.out.println("Binary form of zz2: " + String.format("%s",Integer.toBinaryString(zz2)));

        //NOT operation
        System.out.println("NOT Operation between 10 and 6: ");
        int x3= 10, y3 = 6, z3;
        z3=x3^~y3;
        System.out.println(z3);

        int xx3=0b1010, yy3=0b0110,zz3;
        zz3=xx3^~yy3;
        System.out.println(zz3);
        System.out.println("Binary form of zz3: " + String.format("%s",Integer.toBinaryString(zz3)));

        //left shit operation
        System.out.println("left-Shift Operation: ");
         int x4 = 0b1001;
         int y4;
         y4= x4<<1;
        System.out.println(y4);
        System.out.println("Binary form of x4: " + String.format("%s",Integer.toBinaryString(x4)));
        System.out.println("Binary form of y4: " + String.format("%s",Integer.toBinaryString(y4)));

        int xx4 = 9;
        int yy4;
        yy4 = xx4 <<1;
        System.out.println(yy4);

        //right shit operation
        System.out.println("right-Shift Operation: ");
        int x5 = 0b1001;
        int y5;
        y5= x5>>1;
        System.out.println(y5);

        int xx5 = 9;
        int yy5;
        yy5 = xx5>>1;
        System.out.println(yy5);
        System.out.println("Binary form of xx5: " + String.format("%s",Integer.toBinaryString(xx5)));
        System.out.println("Binary form of yy6: " + String.format("%s",Integer.toBinaryString(yy5)));

        //unsigned right shit operation
        System.out.println("unsigned right-Shift Operation: \n negative values are stored in 2s compliment form: ");
        int x6 = -0b1001;
        int y6;
        y6= x6>>>1;
        System.out.println(y6);
        System.out.println("Binary form of x6: " + String.format("%s",Integer.toBinaryString(x6)));
        System.out.println("Binary form of y6: " + String.format("%s",Integer.toBinaryString(y6)));

        int xx6 = -9;
        int yy6;
        yy6 = xx6>>>1;
        System.out.println(yy6);
    }
}
