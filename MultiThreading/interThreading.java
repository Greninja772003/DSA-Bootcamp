package MultiThreading;

class object {
    int value;
    boolean flag= true;

   synchronized public int getValue() {
        while (flag!=false){
            try{wait();}catch(Exception e){}
        }
        flag = true;
        notify();
        return value;
    }

    synchronized public void setValue(int value) {
        while (flag!=true){
            try{wait();} catch (Exception e){}
        }
        this.value = value;
        flag = false;
        notify();
    }
}

class producer extends Thread {
    object obj;

    public producer(object obj) {
        this.obj = obj;
    }

    public void run() {
        int count = 0;
        while (true) {
            obj.setValue(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class consumer extends Thread {
    object obj;

    public consumer(object obj) {
        this.obj = obj;
    }

    public void run() {
        int value;
        while (true) {
            value = obj.getValue();
            System.out.println("Consumer " + value);
        }
    }
}

public class interThreading extends Thread {
    public static void main(String[] args) {
        object obj = new object();
        producer obj1 = new producer(obj);
        consumer obj2 = new consumer(obj);
        obj1.start();
        obj2.start();
    }
}
