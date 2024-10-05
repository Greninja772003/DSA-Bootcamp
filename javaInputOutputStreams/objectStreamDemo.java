package javaInputOutputStreams;

import java.io.*;

class studentDetails2 implements Serializable {
    private int rollNo;
    private String name;
    private String dept;
    private float avg;
    public static int data = 2039;
    public transient int t;

    public studentDetails2(int rollNo, String name, String dept, float avg) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.avg = avg;
        this.t = 500;
    }

    @Override
    public String toString() {
        return " studentDetails2 {" + '\n' +
                "  rollNo=" + rollNo + '\n' +
                ", name='" + name + '\n' +
                ", dept='" + dept + '\n' +
                ", avg=" + avg + '\n' +
                ", t=" + t + '\n' +
                '}';
    }

    public studentDetails2() {
    }
}

public class objectStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        studentDetails2 obj = new studentDetails2(7, "ankur", "FSDB", 97.9f);
        oos.writeObject(obj);
        fos.close();
        oos.close();
        FileInputStream fis = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        studentDetails2 obj1 = (studentDetails2) ois.readObject();
        System.out.println(obj1);
        fis.close();
        ois.close();
    }
}
