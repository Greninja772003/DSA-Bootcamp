package Inheritance;
 class first{
    void display(){
        System.out.println("first class method called");
    }
}
class second extends first{
    void display(){
        System.out.println("second class method called");
    }
}
public  class overriding {
    public static void main(String[] args) {
        first obj = new first();
        obj.display();
        first obj2 = new second();
        obj2.display();

        tv obj3 = new tv();
        obj3.switchOn();
        obj3.channelChanged();
        smartTv obj4 = new smartTv();
        obj4.switchOn();
        obj4.channelChanged();
        obj4.browser();
        
        tv obj5 = new smartTv();
        obj5.switchOn();
        obj5.channelChanged();


    }
}
class tv {
     void switchOn(){
        System.out.println("Tv is Switched on");
    }
    void channelChanged(){
        System.out.println("Tv's channel changed");
    }
}
class smartTv extends tv{

     void switchOn(){
         System.out.println("Smart-Tv is Switched on");
     }
    void channelChanged(){
        System.out.println("Smart-Tv channel changed");
    }
    void browser(){
        System.out.println("Browsing the search");
    }
}