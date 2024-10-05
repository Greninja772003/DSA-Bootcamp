package staticAndFinal;

import java.util.Date;

public class student {
    private String name;
    private String rollNumber;
    private static int count = 1;
    private String naame;
    private String depart;

    static String rollNumberGenerator() {
        Date d = new Date();
        String rollN = "SVVV" + (d.getYear() + 1900) + count;
        count++;
        return rollN;
    }

    public student(String name, String depart) {
        this.rollNumber = rollNumberGenerator();
        this.depart = depart;
        this.naame = name;
    }

    public static void main(String[] args) {
        student obj = new student("ankur", "cse");
        System.out.println(obj.naame + " " + obj.rollNumber + " " + obj.depart);

        student obj1 = new student("rohit", "cse");
        System.out.println(obj1.naame + " " + obj1.rollNumber + " " + obj1.depart);

        student obj2 = new student("virat", "cse");
        System.out.println(obj2.naame + " " + obj2.rollNumber + " " + obj2.depart);
    }
}
