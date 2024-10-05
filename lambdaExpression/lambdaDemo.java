package lambdaExpression;

interface myLambda{
    public int add(int x, int y);
}
interface myLambda1{
    public void display();
}
class demo{
    int val = 10;
    public void method(){
        int count =0;
        myLambda1 obj = ()->{
            System.out.println("hello ji");
            System.out.println("how do you do "+val);
        };
        obj.display();
    }
}
 class useLambda {
    public void callLambda(myLambda1 m1){
        m1.display();
    }
}
class Demo1 {
    public void method(){
        useLambda obj = new useLambda();
        obj.callLambda(()->{
            System.out.println("Hello ji");
        });
    }
}
//class my implements myLambda{
//    public void display(){};
//
//}
public class lambdaDemo {
    public static void main(String[] args) {
//        myLambda obj = ()->{System.out.println("hey");}
        myLambda obj2 = (a,b)-> a+b;
        System.out.println(obj2.add(23,43));
demo ob = new demo();
ob.method();
Demo1 obj1 = new Demo1();
obj1.method();
    }
}
