package Interfaces;

public class phone {
    public void call(){
        System.out.println("-> Make a phone call");
    }
    public void sms(){
        System.out.println("-> Send a message to xyz");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}
class smartPhone extends phone implements ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("-> video call has been made from smart phone");
    }
    @Override
    public void click(){
        System.out.println("-> Clicking photo from smart phone");
    }
    public void record(){
        System.out.println("-> Video has been recorded from smart phone");
    }
    public void play(){
        System.out.println("-> Music is playing by smart phone");
    }
    public void stop(){
        System.out.println("-> Music has been stopped by smart phone");
    }
}
class sampleClass1{
    public static void main(String[] args) {
        smartPhone obj = new smartPhone();
        obj.click();
        obj.play();
        obj.record();
        obj.stop();
        obj.videoCall();
        obj.call();
        obj.sms();
        System.out.println(" ");
        ICamera obj1 = new smartPhone();
        obj1.click();
        obj1.record();
        System.out.println(" ");
        IMusicPlayer obj2 = new smartPhone();
        obj2.play();
        obj2.stop();
    }
}


