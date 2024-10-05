package Oops;

import java.util.Arrays;

public class Student2 {
    private String rollNo;
    private String name;
    private String department;
    private String[] subs;

    public Student2(String rollNo, String name, String department, String[] subs) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.subs = subs;
    }

    public void setSubs(String[] subs) {
        this.subs = subs;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getSubs() {
        return subs;
    }
    public void detail() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Subjects: "+ Arrays.toString(subs));
    }
    public static void main(String[] args) {
        String []arr= {"Operating System","Data Base Management System","Data Structures & Algorithms","Design of Algorithms","Design Thinking"};
        Student2 obj = new Student2("22100BTCSFBI13481","ANKUR MISHRA", "B.Tech",arr );
        obj.detail();
    }
}
