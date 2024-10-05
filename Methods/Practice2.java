package Methods;

public class Practice2 {
    static void show(int... a) {
        for (int x : a) {
            System.out.print(x+" ");
        }
        System.out.println(" ");
    }

    public static void main(String ...args) {

        show(10,2030,212);
        show(87,45,48,52);
        show(87,45,48,52,48,35,12);
        show(87,45,48,52,48,35,12,98,45,35,12);
        show(new int[] {87,45,48,52,48,35,12,10,2030,212});
        show("ankur","aayush","virat","rohit","ansh");
        show(6,"mishra","bansal","kohli","sharma","mishra");
    }
    static void show(String ...asd){
        for (int i=0; i<asd.length; i++) {
            System.out.println(i+1 + ". " + asd[i]);
        }
    }
    static void show(int start,String ...asd){
        for (int i=0; i<asd.length; i++) {
            System.out.println(start + ". " + asd[i]);
            start++;
        }
    }
}
