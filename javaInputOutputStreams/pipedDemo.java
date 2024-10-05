package javaInputOutputStreams;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class producer extends Thread{
    OutputStream out;
    public producer(OutputStream out) {
        this.out = out;
    }
   synchronized public void run(){
        int count =1;
        while(true){
            try {
                out.write(count);
                out.flush();
                System.out.println("Producer "+ count);
                Thread.sleep(10);
                count++;
            }catch (Exception e){}
        }
    }
}
class consumer extends Thread{
    InputStream in;
    public consumer(InputStream in) {
        this.in = in;
    }
   synchronized public void run(){
        int X;
        while(true){
            try {
                X=in.read();
                System.out.println("Consumer "+ X);
                Thread.sleep(10);
               System.out.flush();

            }catch (Exception e){}
        }
    }
}
public class pipedDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        producer p = new producer(pos);
        consumer c = new consumer(pis);
        p.start();
        c.start();
    }
}
