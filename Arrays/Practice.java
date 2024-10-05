package Arrays;

public class Practice {
    public static void main(String[] args) {
        int a[]= new int[10];
        int b[]={1,42,5,3,5,36,464,4};
        int c[];
        c= new int[4];
        int [] d = {4,3,4,543,6,6,4,3,2};
        for (int x : b) {
//            System.out.println(x);
        }
        System.out.println("Value of 3rd index in array b[] " + b[3]);
        b[3]= 3489;
        System.out.println("Value of 3rd index in array b[] " + b[3]);
        for (int i = 0; i < b.length; i++) {
            System.out.println(++b[i]);
        }
    }
}
