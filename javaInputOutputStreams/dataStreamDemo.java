package javaInputOutputStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class studentDetails{
    int rollNo;
    String name;
    String dept;
    float avg;
}
public class dataStreamDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        studentDetails obj = new studentDetails();
        obj.rollNo = 7;
        obj.name = "ankur";
        obj.dept = "FSDB";
        obj.avg = 97.9f;
        dos.writeInt(obj.rollNo);
        dos.writeUTF(obj.name);
        dos.writeUTF(obj.dept);
        dos.writeFloat(obj.avg);
        dos.close();
        fos.close();
        FileInputStream fis = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);
        studentDetails obj1 = new studentDetails();
        obj1.rollNo = dis.readInt();
        obj1.name = dis.readUTF();
        obj1.dept = dis.readUTF();
        obj1.avg = dis.readFloat();
        System.out.println("Name: "+ obj1.name);
        System.out.println("Roll number: "+ obj1.rollNo);
        System.out.println("Department: "+ obj1.dept);
        System.out.println("Average: "+ obj1.avg);
    }
}
