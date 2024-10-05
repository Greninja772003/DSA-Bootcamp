package Inheritance;

public class parent {
    public parent() {
        System.out.println("Parent Constructor called");
    }
}
class child extends parent{
    public child() {
        System.out.println("Child Constructor called");
    }
}
class grandChild extends child{
    public grandChild() {
        System.out.println("Grand Child constructor called");
    }
}
class sampleClass3 {
    public static void main(String[] args) {
        grandChild g = new grandChild();
    }
}
