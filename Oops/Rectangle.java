package Oops;

public class Rectangle {
    private int length;
    private int breadth;
    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
    public boolean isSquare() {
        if(length == breadth) {
            return true;
        } else return false;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class rectangleTest {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setBreadth(10);
        obj.setLength(12);
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
    }
}