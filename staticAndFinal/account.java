package staticAndFinal;

import java.util.Date;

public class account {
        private String name;
        private String accNumber;
        private String accountType;
        private static int count = 1;

        static String accNumberGenerator() {
            Date d = new Date();
            String rollN = "IFSC6541" + (d.getYear() + 1900) + count;
            count= count+7;
            return rollN;
        }

        public account(String name, String accountType) {
            this.accNumber = accNumberGenerator();
            this.accountType = accountType;
            this.name = name;
        }

        public static void main(String[] args) {
            account obj = new account("Ankur", "savings");
            System.out.println(obj.name + " " + obj.accNumber + " " + obj.accountType);

            account obj1 = new account("john", "current");
            System.out.println(obj1.name + " " + obj1.accNumber + " " + obj1.accountType);

            account obj2 = new account("smith", "current");
            System.out.println(obj2.name + " " + obj2.accNumber + " " + obj2.accountType);
        }
    }

