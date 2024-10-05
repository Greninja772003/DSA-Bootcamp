package javaInputOutputStreams;

import java.io.*;
import java.util.HashMap;

class student{
    int rollNo;
    String name;
    String dept;
}
public class printStreamDemo {
    public static void main(String[] args)throws Exception {
        FileOutputStream fo = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student1.txt");
        PrintStream ps = new PrintStream(fo);
        student obj = new student();
        obj.dept = "cse";
        obj.name = "ankur";
        obj.rollNo = 7;
        ps.println(obj.name);
        ps.println(obj.rollNo);
        ps.println(obj.dept);
        ps.close();
        fo.close();
        FileInputStream fi = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
        student obj1 = new student();
        obj1.name= br.readLine();
        obj1.rollNo = Integer.parseInt(br.readLine());
        obj1.dept = br.readLine();
        System.out.println(
                "Name: "+ obj1.name
        );
        System.out.println(
                "Roll no.: "+ obj1.rollNo
        );
        System.out.println(
                "Department: "+ obj1.dept
        );
    }
}
