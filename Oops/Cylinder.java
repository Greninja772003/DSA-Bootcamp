package Oops;

public class Cylinder {
    double radius;
    double height;

    double surfaceArea(double radius, double height) {
        double surArea = 2 * Math.PI * radius * (height + radius);
        return surArea;
    }

    double volume(double radius, double height) {
        double vol = Math.PI * radius * radius * height;
        return vol;
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        System.out.println("Surface area of cylinder: " + cyl.surfaceArea(5, 3));
        System.out.println("Volume of cylinder: " + cyl.volume(5, 3));
    }
}
