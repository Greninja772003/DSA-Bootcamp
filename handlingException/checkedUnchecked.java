package handlingException;

import java.io.FileInputStream;

class lowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than $5000";
    }
}
public class checkedUnchecked {
    static void show1() {
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
    static void show2() {
        show1();
    }
    static void show3() {
        show2();
    }
    static void fun1(){
        try {
            throw new lowBalanceException();
        }
        catch (lowBalanceException e){
            System.out.println(e.getMessage());
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        show3();
        fun3();
    }
}
