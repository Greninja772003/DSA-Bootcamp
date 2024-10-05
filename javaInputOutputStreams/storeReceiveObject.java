package javaInputOutputStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class storeReceiveObject  {
    public static void main(String[] args) throws Exception {
        float list[] = {1.2f, 4.53f,6.54f,8.9f,6.45f};
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/List.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(list.length);
        for (float x : list) {
            dos.writeFloat(x);
        }
        dos.close();
        fos.close();
        FileInputStream fis  = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/List.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
