package dataTypes;

public class literals {
    public static void main(String[] args) {
        byte b = 38;//integer value
        short s = 3094;//integer value
        int i = 8958; //integer value

        byte b1 = 10;// value 10 in decimal system
        byte b2 = 0b1010; // value 10 in binary system
        byte b3 = 012;//value 10 in octal system
        byte b4 = 0XA;// 10 in hexadecimal system

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l = 9999_9999_9999L;
        int ew = 3498;
        float f1 = 43.645F;
        double d2 = 213.64364;

        System.out.println(l);
        System.out.println(ew);
        System.out.println(f1);
        System.out.println(d2);
    }
}
