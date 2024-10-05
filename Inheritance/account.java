package Inheritance;

public class account {
    private String accountNumber;
    private String personName;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public account(String accountNumber, String personName, String address, String phoneNumber, String dateOfBirth, double balance) {
        this.accountNumber = accountNumber;
        this.personName = personName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public account() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void close() {
        System.out.println("Closing Account ...");
    }
}

class savingsAccount extends account {
    public savingsAccount() {
    }

    public void details() {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Customer name: " + getPersonName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer phone number: " + getPhoneNumber());
        System.out.println("Customer's DOB: " + getDateOfBirth());
        System.out.println("Current Balance: " + getBalance());

    }

    public savingsAccount(String accountNumber, String personName, String address, String phoneNumber, String dateOfBirth, double balance) {
        super(accountNumber, personName, address, phoneNumber, dateOfBirth, balance);

    }

    public void deposit(double deposit) {
        savingsAccount obj = new savingsAccount("HDFC-584121651", "Ankur", "A GF-25 Indus Satellite Greens", "+918818883200", "07/07/2003", 27000);
        double balance = obj.getBalance() + deposit;
        System.out.println("Your current balance after deposit: " + balance);
    }

    public void withdraw(double withdraw) {
        savingsAccount obj = new savingsAccount("HDFC-584121651", "Ankur", "A GF-25 Indus Satellite Greens", "+918818883200", "07/07/2003", 27000);
        double balance = obj.getBalance() - withdraw;
        System.out.println("Your current balance after withdraw: " + balance);
    }

    public void FixedDeposit(double deposit) {
        double fixedDeposit = deposit;
        System.out.println("Your Fixed deposit value: " + fixedDeposit);
    }

    public void liquidate(String date) {
        System.out.println("Your fixed deposit maturity date: " + date);
    }
}

class loanAccount extends account {
    public void emi(double loanAmount, double interest) {
        double emiAmount = loanAmount * interest / 100;
        System.out.println("Your EMI amount for the upcoming month is: " + emiAmount);
    }
    public void details() {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Customer name: " + getPersonName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer phone number: " + getPhoneNumber());
        System.out.println("Customer's DOB: " + getDateOfBirth());
        System.out.println("Current Balance: " + getBalance());
    }
    public loanAccount(String accountNumber, String personName, String address, String phoneNumber, String dateOfBirth, double balance) {
        super(accountNumber, personName, address, phoneNumber, dateOfBirth, balance);
    }

    public loanAccount() {
    }
}

class sampleClass1 {
    public static void main(String[] args) {
        savingsAccount obj = new savingsAccount("HDFC-584121651", "Ankur", "A GF-25 Indus Satellite Greens", "+918818883200", "07/07/2003", 27000);
        obj.details();
        obj.deposit(50000);
        obj.FixedDeposit(1000000);
        obj.liquidate("07/07/2030");
        System.out.println(" ");
        loanAccount obj1 = new loanAccount("HDFC-584121651", "Ankur", "A GF-25 Indus Satellite Greens", "+918818883200", "07/07/2003", 27000);
        obj1.details();
        obj1.emi(800000,7.6);
    }
}