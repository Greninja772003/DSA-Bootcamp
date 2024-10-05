package Generics;

class Data<T>{
    private T obj;

    public void setData(T obj) {
        this.obj = obj;
    }

    public T getData() {
        return obj;
    }
}
@SuppressWarnings("ALL")
class MyArray<T>{
    T a[] =(T[]) new Object[10];
    int length = 0;
    public void append(T v){
        a[length++]= v;
    }
    public void display(){
        for (int i = 0; i < length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println(" ");
    }
}
class MyArray2 extends  MyArray{

}
@SuppressWarnings("ALL")
public class genericDemo<T>{

    public static void main(String[] args) throws Exception {
        Data<String> d = new Data<>();
        d.setData("HI");
        System.out.println(d.getData());

        MyArray ma = new MyArray<>();
        ma.append(10);
        ma.append("ankur");
        ma.append(89.5156f);
        ma.display();

        MyArray2 ma2 = new MyArray2();
        ma2.append("ankur");
        ma2.append(10);
        ma2.append("alex");
        ma2.display();
    }
}
