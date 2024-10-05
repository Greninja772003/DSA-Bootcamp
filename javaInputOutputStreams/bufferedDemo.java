package javaInputOutputStreams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class bufferedDemo {
    public static void main(String[] args)  throws  Exception{
        FileReader fis = new FileReader("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/test.txt");
        BufferedReader bis = new BufferedReader(fis);
        System.out.println("File "+ fis.markSupported());
        System.out.println("Buffer: "+ bis.markSupported());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println(bis.readLine());
    }
}
