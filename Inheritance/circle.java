package Inheritance;

public class circle {
    private double radius;
    public double area(){
        return 3.14*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 3.14*2*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class cylinder extends circle{
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return area()*height;
    }
}
class sampleClass extends cylinder{
    public static void main(String[] args) {
        cylinder obj = new cylinder();
        obj.setRadius(5);
        obj.setHeight(12);
        System.out.println("volume of Cylinder: "+ obj.volume());
    }
}
