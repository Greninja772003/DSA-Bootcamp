package MultiThreading;

public class atm {
    synchronized public void checkBalance(String name){
        System.out.println(name+ " checking ");
        try {Thread.sleep(100);}catch (Exception e){}
        System.out.println("Balance");
    }
   synchronized public void withDraw(String name, int amount){
        System.out.println(name + " withdrawing ");
        try {
            Thread.sleep(100);
        }catch (Exception e){}
        System.out.println(amount);
    }
}
class customer extends Thread{
    String name;
    int amount;
    atm ATM;
    customer(String n, atm a, int amt){
        this.name = n;
        this.ATM = a;
        this.amount= amt;
    }
    public void useAtm(){
        ATM.checkBalance(name);
        ATM.withDraw(name, amount);
    }
    public void run(){
        useAtm();
    }
}
class sampleTest extends Thread{
    public static void main(String[] args) {
        atm obj = new atm();
        customer obj1 = new customer("ankur", obj, 9385734);
        customer obj2 = new customer("rohit", obj, 734);
        obj1.start();
        obj2.start();
    }
}