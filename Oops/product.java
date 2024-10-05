package Oops;

public class product {
private String itemNo;
private String name;
private double price;
private int qty;
    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(short qty) {
        this.qty = qty;
    }

    public product(String itemNo, String name, double price, int qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public static void main(String[] args) {
product obj = new product("A24-948","Frooti", 847.0,100);
        System.out.println("Name of obj product: "+ obj.name);
        System.out.println("Item number of obj product: "+ obj.itemNo);
        System.out.println("Price of obj product: "+ obj.price);
        System.out.println("Quantity of obj product: "+ obj.qty);
    }
}
