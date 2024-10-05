package abstractClass;

public abstract class Super {
    public Super() {
        System.out.println("Super class default constructor");
    }

    public void meth1() {
        System.out.println("Super class meth1");
    }

    abstract void meth2();
}

class sub extends Super {
    @Override
    public void meth2() {
        System.out.println("sub class meth2");
    }
}

class abstractExample {
    public static void main(String[] args) {
        sub obj = new sub();
        obj.meth2();
        obj.meth1();
        System.out.println(" ");
        Super so = new sub();
        so.meth2();
    }
}

