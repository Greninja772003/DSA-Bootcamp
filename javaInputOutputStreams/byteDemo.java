package javaInputOutputStreams;

import java.io.*;
import java.nio.ByteOrder;

public class byteDemo {
    public static void main(String[] args) throws IOException {
        byte []b = {'a','b','c','d','e','f','g','h'};
        ByteArrayInputStream byt = new ByteArrayInputStream(b);
//        int x;
//        while ((x=byt.read())!=-1){
//            System.out.print((char) x);
//        }
        System.out.println(byt.markSupported());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');

        byte ab[] = bos.toByteArray();
        for (byte x: ab) {
            System.out.println((char)x);
        }
        bos.writeTo(new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/byte.txt"));

        bos.close();
        char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr= new CharArrayReader(c);
        int var;
        while ((var= cr.read())!=-1){
            System.out.println((char)var);
        }
        cr.close();
    }
}
