package Inheritance;

public class class1 {
    public class1() {
        System.out.println("Non parametrized constructor of class1");
    }
    public class1(int x) {
        System.out.println("parametrized constructor of class1: "+ x);
    }
}
 class class2 extends class1{
    public class2() {
        System.out.println("Non parametrized constructor of class2");
    }
     public class2(int x) {
         System.out.println("parametrized constructor of class2: "+ x);
     }
     public class2(int x, int y){
        super(x);
         System.out.println("parametrized constructor of class2: "+ y);
     }
}
class sampleClass4{
    public static void main(String[] args) {
        class2 obj = new class2(12,45);
    }
}