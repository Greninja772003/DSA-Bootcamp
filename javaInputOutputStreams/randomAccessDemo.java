package javaInputOutputStreams;
import java.io.RandomAccessFile;

public class randomAccessDemo {
    public static void main(String[] args)throws Exception {
        RandomAccessFile rf = new RandomAccessFile("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/data.txt", "rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+14);
        System.out.println((char)rf.read());
    }
}
