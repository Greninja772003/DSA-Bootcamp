package operatorsAndExpression;

public class masking {
    public static void main(String[] args) {
        byte a =9,b=3;
        byte c = (byte) ( a << 4);
        c = (byte) (c|b);
        System.out.println("First 4 bits value in variable c: " + ((c&0b11110000)>>4));
        System.out.println("Last 4 bits value in variable c:  " + (c&0b00001111));
    }
}
