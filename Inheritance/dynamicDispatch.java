package Inheritance;
class Super {
    void meth1(){
        System.out.println("super class meth1");
    }
    void meth2(){
        System.out.println("super class meth2");
    }
}
class sub extends Super{
    void meth2(){
        System.out.println("sub class meth2");
    }
    void meth3(){
        System.out.println("sub class meth3");
    }
}
public class dynamicDispatch {
    public static void main(String[] args) {
        Super obj = new sub();
        obj.meth1();
        obj.meth2();
        System.out.println(" ");
        sub obj1 = new sub();
        obj1.meth2();
        obj1.meth3();

    }
}
