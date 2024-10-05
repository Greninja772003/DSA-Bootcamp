package Interfaces;

public interface Practice {
    int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    default void meth3(){
        System.out.println("meth3 of Practice interface");
    };
}
interface test5 extends Practice{
    void meth4();
}
class sampleTEst implements test5{

   public void meth1(){};
   public void meth2(){};
    public void meth4(){};
}
class sampleMain {
    public static void main(String[] args) {
        System.out.println(Practice.X);
        sampleTEst  obj = new sampleTEst();
        obj.meth3();
    }
}
