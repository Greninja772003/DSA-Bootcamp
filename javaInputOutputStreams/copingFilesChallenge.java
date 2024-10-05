package javaInputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;

public class copingFilesChallenge {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/test.txt");
                FileOutputStream fis = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/text.txt");) {
         int b;
         while((b=fos.read())!=-1){
             if (b>=65&&b<=90)fis.write(b+32);
             else fis.write(b);
             System.out.print((char)b);
         }
         fis.close();
         fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
