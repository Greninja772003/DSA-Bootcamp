package Oops;

public class Customer {
    private String cusId;
    private String cusName;
    private String cusAddress;
    private String cusPhoneNo;

    public String getCusId() {
        return cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public String getCusPhoneNo() {
        return cusPhoneNo;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public Customer(String cusId, String cusName, String cusAddress, String cusPhoneNo) {
        this.cusId = cusId;
        this.cusName = cusName;
         this.cusAddress = cusAddress;
        this.cusPhoneNo = cusPhoneNo;
    }

    public Customer(String cusId, String cusName) {
        this.cusId = cusId;
        this.cusName = cusName;
    }

    public void setCusPhoneNo(String cusPhoneNo) {
        this.cusPhoneNo = cusPhoneNo;
    }
    public void details(){
        System.out.println("Customer id: "+ cusId);
        System.out.println("Customer name: "+ cusName);
        System.out.println("Address id: "+ cusAddress);
        System.out.println("Contact number: "+ cusPhoneNo);
    }

    public static void main(String[] args) {
        Customer obj = new Customer("A23-fd893","Ankur","AGF-25 Indus Satellite Greens", "+91-8818883200");
        obj.details();
    }
}
