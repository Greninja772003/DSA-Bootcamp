package Oops;

public class Circle {
    double radius;
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle cir = new Circle();
        Circle cir2 = new Circle();
        System.out.println(cir.area(12));
        System.out.println(cir.perimeter(5));
        System.out.println(cir2.area(3));
        System.out.println(cir2.perimeter(7));
    }
}
