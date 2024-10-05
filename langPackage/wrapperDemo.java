package langPackage;

public class wrapperDemo {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(9786);
        Integer and = 9834;
        System.out.println(and);
//        System.out.println(and.byteValue());
        Byte b = 93;
        Byte b1 = Byte.valueOf(b);
        Byte b2 = Byte.valueOf("34");
        System.out.println(b2);
        System.out.println(b.intValue());

        Integer m = 943;
        Integer m1 = Integer.valueOf("0001", 5);
        System.out.println(m1);
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(548651456));
    }
}
