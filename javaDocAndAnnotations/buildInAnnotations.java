package javaDocAndAnnotations;

public class buildInAnnotations  {
}
 abstract class parent{
   abstract public void display();
 }
 class child extends parent{
     @Override
     public void display(){}
     @Deprecated
     public void show(){
         System.out.println("hello ji");
     }
     @SuppressWarnings("depreciation")
     public static void main(String[] args) {
         child obj = new child();
         obj.show();
     }
 }
