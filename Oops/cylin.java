package Oops;

public class cylin {
    private double length;
    private double radius;

    public double getLength() {
        return length;
    }

    public cylin() {
        length=1;
        radius =1;
    }

    public cylin(double length, double radius) {
        this.length = length;
        this.radius = radius;
    }

    public void setLength(double length) {
        if(length>0) {
            this.length = length;
        }else this.length= 1;
    }


    public cylin(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >0) {
        this.radius = radius;
    }else this.radius = 1;
    }
    public double volume(){
        return 3.14*radius*radius*length;
    }

    public static void main(String[] args) {
        cylin bob = new cylin();
        cylin bob2 = new cylin(12,5);
        cylin bob3 = new cylin(7);
        bob3.setRadius(3);

        System.out.println("Volume of bob cylinder: "+bob.volume() );
        System.out.println("Volume of bob2 cylinder: "+bob2.volume() );
        System.out.println("Volume of bob3 cylinder: "+bob3.volume() );

    }
}
