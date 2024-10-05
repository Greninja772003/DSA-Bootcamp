package Oops;

public class Rect {
    private double length;
    private double breadth;
    public double  area(){
        return length*breadth;
    }
    public Rect(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    public Rect() {
        length= 1;
        breadth=1;
    }

    public Rect(double s) {
        this.length =this.breadth= s;
    }

    public static void main(String[] args) {
        Rect obj = new Rect();
        Rect obj2 = new Rect(12,15);
        Rect obj3 = new Rect(6);
        System.out.println("Area of rectangle obj: "+ obj.area());
        System.out.println("Area of rectangle obj2: "+ obj2.area());
        System.out.println("Area of rectangle obj3: "+ obj3.area());
    }
}
