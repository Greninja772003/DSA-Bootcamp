package javaInputOutputStreams;

import java.io.*;
import java.util.Scanner;

class customer implements Serializable {
    String cusID;
    String name;
    String phNo;
    static int count = 1;

    public customer() {
    }

    public customer( String name, String phNo) {
        this.cusID = "C"+count;
        count++;
        this.name = name;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "customer {" +
                "  \ncusID= " + cusID +
                ", \nname= " + name +
                ", \nphNo= " + phNo +
                "\n}";
    }
}

public class storeReceiveObject2 {
//   public static void main(String[] args) throws Exception {
//        customer list[] = {new customer("ankur", "88"),new customer("john","34645334"), new customer("mike","230942384")};
//        FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/customer.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(list.length);
//        for (customer c : list) {
//            oos.writeObject(c);
//        }
//        oos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/javaInputOutputStreams/customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length = ois.readInt();
        customer list[] = new customer[length];
        for (int i = 0; i < length; i++) {
            list[i]= (customer)ois.readObject();
        }
        System.out.println("Enter name of Customer");
        String name = sc.nextLine();
        for (int i = 0; i < length; i++) {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
            ois.close();
            fis.close();
        }
    }
}
