package Interfaces;

public interface  test {
    void meth1();

    void meth2();
}

class test2 implements test {

    @Override
    public void meth1() {
        System.out.println("meth1 of test2 class");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of test2 class");
    }

    public void meth3() {
        System.out.println("meth3 of test2 class");
    }
}

class sampleClass {
    public static void main(String[] args) {
        test obj = new test2();
        obj.meth1();
        obj.meth2();
        test2 obj1 = new test2();
        obj1.meth1();
        obj1.meth2();
        obj1.meth3();

    }
}