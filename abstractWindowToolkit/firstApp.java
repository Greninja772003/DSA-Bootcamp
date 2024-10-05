package abstractWindowToolkit;
import java.awt.*;
class myFrame extends Frame{
    Label l;
    TextField tf;
    Button b;
    public myFrame(){
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
}
public class firstApp {
    public static void main(String[] args) {
//        Method 1
//        Frame f = new Frame("My First Application");
//        f.setLayout(new FlowLayout());
//        Button b = new Button("OK");
//        Label l = new Label("Name");
//        TextField tf = new TextField(20);
//        f.add(l);
//        f.add(tf);
//        f.add(b);
//        f.setSize(300,330);
//        f.setVisible(true);

//        Method 2
        myFrame1 mf = new myFrame1();
        mf.setSize(350,300);
        mf.setVisible(true);
     }
}
