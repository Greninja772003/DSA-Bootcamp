package handlingException;

import java.util.Arrays;

class stackOverFlow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}
class stackUnderFlow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
public class stackClass {
    private int size;
    private int top = -1;
    public int s[];

    public stackClass(int sz){
        size= sz;
        s= new int[sz];
    }
    public void push(int x) throws stackOverFlow{
        if (top==size-1){
            throw new stackOverFlow();
        }
        top++;
        s[top]=x;
    }
    public int pop()throws stackUnderFlow{
        int x = -1;
        if (top==-1){
            throw new stackUnderFlow();
        }
        x=s[top];
        top--;
        return x;
    }
}
class stackException{
    public static void main(String[] args) {
        stackClass obj =new stackClass(5);
        try {
            obj.push(23);
            obj.push(254);
            obj.push(64);
            obj.push(1);
            obj.push(87);
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
        }
        catch (stackOverFlow e){
            System.out.println(e);
        }catch (stackUnderFlow f){
            System.out.println(f);
        }
        System.out.println("Elements of stack: "+ Arrays.toString(obj.s));

    }
}