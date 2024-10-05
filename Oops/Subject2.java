package Oops;

public class Subject2 {
    public static void main(String[] args) {
        subject obj[]= new subject[5];
        obj[0]= new subject("BTIBM401N","DBMS",100);
        obj[1]= new subject("BTIBM402N","Operating Series",100);
        obj[2]= new subject("BTIBM403N","Data Structure & Algorithms",100);
        obj[3]= new subject("BTIBM404N","Design of Algorithms",100);
        obj[4]= new subject("BTIBM405N","Design Thinking",100);
        for (int i = 0; i<obj.length; i++) {
            obj[i].detail();
            System.out.println(" ");
        }
    }
}
