package abstractWindowToolkit;

import java.awt.*;

class myFrame7 extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public myFrame7() {
        super("flowLayoutDemo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
//        FlowLayout fl = new FlowLayout();
//        fl.setAlignment(FlowLayout.CENTER);
//        fl.setHgap(50);
//        setLayout(fl);
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
//        add(b5,BorderLayout.CENTER);
//        add(b6);
        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("MON"));
        p.add(new Button("TUE"));
        p.add(new Button("WED"));
        add(p, BorderLayout.CENTER);
    }
}

public class layoutDemo {
    public static void main(String[] args) {
        myFrame7 f = new myFrame7();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}