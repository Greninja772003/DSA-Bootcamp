package javaInputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class copyDataFrom2Files {
    public static void main(String[] args) throws Exception{
        FileInputStream file1 = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/test.txt");
        FileInputStream file2 = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/text.txt");
        FileOutputStream des = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/destination.txt");
        SequenceInputStream seq = new SequenceInputStream(file1,file2);
        int x;
        while ((x=seq.read())!=-1){
            des.write((char)x);

        }
        file2.close();
        file1.close();
        des.close();
        seq.close();
    }
}
