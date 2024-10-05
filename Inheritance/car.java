package Inheritance;

public class car {
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Manually gear changed");
    }
}
class automaticCar extends car{
    public void changeGear(){
        System.out.println("Automatic gear changed");
    }
    public void openRoof(){
        System.out.println("Sun roof opened");
    }
}
class test {
    public static void main(String[] args) {
        automaticCar obj = new automaticCar();
        obj.changeGear();
        obj.openRoof();
        System.out.println(" ");
        car obj1 = new car();
        obj1.start();

        obj1.accelerate();
        obj1.changeGear();
    }
}
