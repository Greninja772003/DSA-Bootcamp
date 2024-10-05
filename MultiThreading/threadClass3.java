package MultiThreading;

public class threadClass3 {
    public static void main(String[] args) {
myData obj = new myData();
sampleThread1 obj1 = new sampleThread1(obj);
sampleThread2 obj2 = new sampleThread2(obj);
        obj1.start();
obj2.start();
    }
}
class myData{
   synchronized   public void display(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
}
class sampleThread1 extends Thread{
    myData d;
    public sampleThread1(myData obj1){
        d= obj1;
    }
    public void run(){
        d.display("hello World!");
    }
}
class sampleThread2 extends Thread{
    myData d;
    public sampleThread2(myData obj1){
        d= obj1;
    }
    public void run(){
        d.display(" Welcome ");
    }
}