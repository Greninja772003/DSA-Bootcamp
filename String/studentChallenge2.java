package String;

public class studentChallenge2 {
    public static void main(String[] args) {
        int b = 11010111;
        String str = String.valueOf(b);
        System.out.println("str String contains binary number? " + str.matches("[01]*"));

        String strr = "59A154";
        System.out.println("strr String contains a hexadecimal number?  "+strr.matches("[0-9A-F]+"));

        String str1 = "07/07/2003";
        System.out.println("str1 String contains a date? " + str1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

    }
}
