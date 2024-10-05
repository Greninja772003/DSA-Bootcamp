package collectionFrameworks;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class account implements Serializable{
    String accNum;
    String name;
    double balance;

    public account(String accNum, String name, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    public account() {
    }

    @Override
    public String toString() {
        return " accNum= " + accNum + ' ' +
                ", name= " + name + ' ' +
                ", balance= " + balance  ;
    }
}
public class studentChallenge {
    public static void main(String[] args) throws  Exception{
        Scanner in = new Scanner(System.in);
        account obj = null;
        HashMap<String,account> hm= new HashMap<>();
        try{
            FileInputStream fis = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/collectionFrameworks/Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                obj = (account) ois.readObject();
                System.out.println(obj);
                hm.put(obj.accNum,obj);
            }
            ois.close();
            fis.close();
        }
        catch (Exception e){}
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/collectionFrameworks/Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("MENU");
        int choice;
        String accNo, name;
        double bal;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (choice){
                case 1:
                    System.out.println("Enter Details by following Account number, Name, Balance ");
                    accNo = in.nextLine();
                    name = in.nextLine();
                    bal = in.nextDouble();
                    obj = new account(accNo, name, bal);
                    hm.put(accNo, obj);
                    System.out.println("Account created for: "+ name);
                    break;
                case 2:
                    System.out.println("Enter Account number");
                    accNo= in.nextLine();
                    hm.remove(accNo);
                    break;
                case 3:
                    System.out.println("Enter Account number");
                    accNo = in.nextLine();
                    obj = hm.get(accNo);
                    System.out.println(obj);
                    break;
                case 4:
                    for (account x : hm.values()) {
                        System.out.println(x);
                    }
                    break;
                case 5:
                case 6: oos.writeInt(hm.size());
                for (account a: hm.values()){
                    oos.writeObject(a);
                }
            }
        }while (choice!=6);
        oos.flush();
        oos.close();
        fos.close();
    }
}

