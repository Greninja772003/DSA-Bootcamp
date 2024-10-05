package handlingException;

import org.w3c.dom.ls.LSOutput;

class negativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a shape can't be negative";
    }
}
public class throwsDemo {
    static int meth1(){
        return 10/0;
    }
    static int meth2(){
      return meth1();
    }
    static int meth3(){
        return meth2();
    }
static int area(int l, int b) throws negativeDimensionException {       if (l<=0|| b<=0)throw new negativeDimensionException();
        return l*b;
}
static void method() throws negativeDimensionException{
    System.out.println("Area is: "+  area(-3,4));
}
    public static void main(String[] args){
        try{
            method();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(meth3());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
