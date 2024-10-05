package javaInputOutputStreams;
import java.io.*;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class fileExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
//            writing the data in a file
            FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/test.txt");
//            System.out.println("Enter the data to store in the file");
            String str = "Web development\n Java programming";
            byte b[] = str.toUpperCase(Locale.ROOT).getBytes();
            fos.write(b);
            fos.close();

//            reading data from a file
            try (FileReader fis = new FileReader("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/test.txt")){

//                fis.read(b);
//                String obj = new String(b);
//                System.out.println(str);
                int x;
              while((x=fis.read())!=-1){
                  System.out.print((char)x);
              }
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
