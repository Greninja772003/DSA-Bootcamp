package MultiThreading;

public class threadClass2 {
    public static void main(String[] args) throws InterruptedException {
        myThread3 obj = new myThread3();
//        obj.setDaemon(true);
        obj.start();
//        Thread mainThread = Thread.currentThread();
//        mainThread.join();
        int i = 0;
        while (true) {
            System.out.println(i++ + " Main");
//            Thread.yield();
        }
    }
}
class myThread3 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i++ + " myThread3");
        }
    }
}
