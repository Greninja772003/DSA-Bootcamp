package MultiThreading;

class myThread extends Thread{
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+ " hello ");
            i++;
        }
    }
}
public class test {
    public static void main(String[] args) {
        myThread obj = new myThread ();
        obj.start();
        int i = 1;
        while (true){
            System.out.println(i+ " world ");
            i++;
        }
    }
}
