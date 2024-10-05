package Loops;

public class Practice2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i >0 ; i--) {
            System.out.println(i);
        }
        int i= 0;
        for (; i <5 ; i++) {
            System.out.println(i);
        }
        for (; i <5 ;) {
            System.out.println(i);
            i++;
        }
//        for(;;){ Endless loop
//            System.out.println(i);
//            i++;
//        }
        for (int k=0,j=1; k<=10;k++,j=j*2){
            System.out.println(k+" "+j);
        }
    }
}
