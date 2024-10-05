package Generics;

public class genericDemo2<A extends Number> {
    A data[] = (A[])new Object[5];
    static <A> void show(A[] list) {
        for (A x : list) {
            System.out.print(x+ " ");
        }
        System.out.println(" ");
    }
    static void fun(MyArray<? super Number> obj){
        obj.display();
    }
    public static void main(String[] args) {
        show(new Object[]{23,54,"ankur"});
        show(new Integer[]{23,54,75,684,5});
        show(new String[]{"mike", "john", "jack"});

        MyArray ma = new MyArray();
        ma.append(4);
        ma.append("football");
        ma.append("Goal");
        fun(ma);
    }
}
