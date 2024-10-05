package lambdaExpression;

import java.util.Locale;

public interface interFace {
    public int display(String str,String str1);
}
class lambdaDemo1{
    public lambdaDemo1(String string) {
        System.out.println(string.toUpperCase());
    }

    public void reverse(String str) {
        StringBuffer obj = new StringBuffer(str);
//        System.out.println(obj);
        obj.reverse();
        System.out.println(obj);
    }
    public static void main(String[] args) {
//        interFace obj = lambdaDemo1::reverse;
//        lambdaDemo1 obj = new lambdaDemo1();

        interFace ob = String::compareTo;
        System.out.println(ob.display("hello ", "ankur"));

    }


}
