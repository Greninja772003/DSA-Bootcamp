package MultiThreading;

public class test2 implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (i<50){
            System.out.println(i+ " hello ");
            i++;
        }
    }
    public static void main(String[] args) {
        test2 t = new test2();
        Thread obj = new Thread(t);
        obj.start();
        int i = 1;
        while (i<50){
            System.out.println(i+ " world ");
            i++;
        }
    }
}
