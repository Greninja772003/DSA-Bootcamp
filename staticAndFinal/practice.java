package staticAndFinal;

public class practice {
    static int x = 904;
    int y = 849;
     void  SHOW() {
         System.out.println(x+ " "+ y);
     }
     static void display(){
         System.out.println(x);
     }
     static {
         System.out.println("Block 1");
     }
     static {
         System.out.println("Block 2");
     }

    public static void main(String[] args) {

    }
}
 class staticClass{
     public static void main(String[] args) {
         System.out.println("main ");
         practice.display();
         practice oob = new practice();
         oob.SHOW();
         oob.y = 84;
         oob.SHOW();
     }
}