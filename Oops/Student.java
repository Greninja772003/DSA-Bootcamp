package Oops;

import java.util.Scanner;

public class Student {
    String rollNum;
    String name;
    String course;
    int m1, m2, m3;
    double marks;
    double avgMarks;
    int grade;

    int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    double avgMarks(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter the name of student");
        obj.name = in.nextLine();
        System.out.println("Enter the roll number of student");
        obj.rollNum = in.nextLine();
        System.out.println("Enter the course of student");
        obj.course = in.nextLine();
        System.out.println("Enter the marks of student");
        obj.m1 = in.nextInt();
        obj.m2 = in.nextInt();
        obj.m3 = in.nextInt();
        obj.marks = obj.totalMarks(obj.m1, obj.m2, obj.m3);
        obj.avgMarks = obj.avgMarks(obj.m1, obj.m2, obj.m3);
        double grade = obj.avgMarks;

        System.out.println("Name of the student: " + obj.name);
        System.out.println("Roll number of student " + obj.rollNum);
        System.out.println("Course name of student: " + obj.course);
        System.out.println("Total marks of student: " + obj.marks);
        System.out.println("Average marks of student: " + obj.avgMarks);

    }
}

