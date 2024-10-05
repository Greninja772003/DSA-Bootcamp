package abstractClass;

abstract class shape {
    abstract void perimeter(String name);
    abstract void area(String name);
}
class circle extends shape{
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public circle(float radius) {
        this.radius = radius;
    }

    void perimeter(String name){
        System.out.println("Perimeter of "+ name+ " is: "+ (2*3.14*radius));
    }
    void area(String name){
        System.out.println("Area of "+ name+ " is: "+ (3.14*radius*radius));
    }
}
class rectangle extends shape{
    int length;
    int breadth;

    public rectangle(int l, int b) {
        this.length = l;
        this.breadth= b;
    }

    void perimeter(String name){
        System.out.println("Perimeter of "+ name+ " is: "+ (2*(length*breadth)));
    }
    void area(String name){
        System.out.println("Area of "+ name+ " is: "+ (length*breadth));
    }
}
class sample{
    public static void main(String[] args) {
        shape obj = new circle(5);
        obj.area("circle");
        obj.perimeter("circle");
        shape obj2 = new rectangle(7,5);
        obj2.perimeter("rectangle");
        obj2.area("rectangle");
    }
}
