package langPackage;
import java.lang.*;

class myObject{
    public String toString(){
        return "my object";
    }
    public int hashCode(){
        return 7777777;
    }
    public boolean equals(myObject obj){
        return this.hashCode()==obj.hashCode();
    }
}
public class langDemo {
    public static void main(String[] args) {
        myObject obj = new myObject();
        myObject obj2 = new myObject();
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
        System.out.flush();
    }
}
