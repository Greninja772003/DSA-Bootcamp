package MultiThreading;

class thread1 implements Runnable {
    public void run() {
    }
}

public class threadClass {
    public static void main(String[] args) throws Exception {
        Thread obj = new Thread();
        System.out.println(obj.getName());
        myThread2 obj1 = new myThread2("greninja");
        System.out.println("Name "+obj1.getName());
        System.out.println("ID "+obj1.getId());
        System.out.println("Priority "+obj1.getPriority());
        System.out.println("State "+obj1.getState());
        obj1.start();
        System.out.println("State "+obj1.getState());
        System.out.println("is Alive? "+obj1.isAlive());
        System.out.println("Daemon "+obj1.isDaemon());
obj1.start();
obj1.interrupt();
    }
}
class myThread2 extends Thread{
    public myThread2(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY);
    }
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
