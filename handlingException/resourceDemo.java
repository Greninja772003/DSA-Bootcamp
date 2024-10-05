package handlingException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class resourceDemo {


static Scanner in;
    static void divide() throws Exception {
        try(FileInputStream f1 = new FileInputStream("src/handlingException/test.txt");Scanner in = new Scanner(f1)) {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(arr[3] / 0);
        }
    }
    public static void main(String[] args) throws Exception {
try {
    divide();
}catch (Exception e){
    System.out.println(e);
}
int x = in.nextInt();
        System.out.println(x);
    }
}
