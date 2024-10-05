package String;

public class regularExpression {
    public static void main(String[] args) {
        String str = "d";
        System.out.println(str.matches("\\S"));

        String abc = "ankur7777@gmail.com";
        System.out.println(abc.matches("\\w*@gmail(.*)"));



    }
}
