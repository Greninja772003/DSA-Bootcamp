package staticAndFinal;

public class finalDemo {
     static final float pi ;
     static {
         pi = 043.54f;
     }
     public  final  void show(){
         System.out.println("hello");
     }
}
class test extends finalDemo{

}
