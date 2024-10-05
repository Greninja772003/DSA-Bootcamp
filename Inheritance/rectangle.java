package Inheritance;

import org.w3c.dom.ls.LSOutput;

public class rectangle {
    int length;
    int breadth;
    int x = 10;
    public rectangle() {
        length= breadth=1;
    }
    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboid extends rectangle{
    int height;
    int x = 20;

    public cuboid(int h) {
        height = h;
    }

    public cuboid(int l, int b, int h) {
        super(l,b);
        this.height = h;
    }
    int volume(){
        return length*breadth*height;
    }
    void display(){
        System.out.println("rectangle x-property value: "+super.x);
        System.out.println("cuboid x-property value: "+x);
    }
}
class sampleClass5{
    public static void main(String[] args) {
        cuboid obj = new cuboid(64);
        System.out.println("Volume of cuboid: "+ obj.volume());
        obj.display();
    }
}