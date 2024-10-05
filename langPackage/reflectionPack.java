package langPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionPack {
    private int a;
    protected int b;
    public int c;
    int d;
    public reflectionPack(){}
    public void display(String s1,String s2){}
    public int show(int x,int y){return 0;}
}
 class reflectDemo{
     public static void main(String[] args) throws NoSuchMethodException {
         Class obj = reflectionPack.class;
         Field arr[] = obj.getDeclaredFields();
         Constructor cons[] = new Constructor[]{obj.getConstructor()};
         Method  meth[] = obj.getMethods();
         for (Field x :arr) {
             System.out.println(x);
         }
         for (Constructor x:cons) {
             System.out.println(x);
         }
         for (Method x:meth) {
             System.out.println(x);
         }
     }
}
