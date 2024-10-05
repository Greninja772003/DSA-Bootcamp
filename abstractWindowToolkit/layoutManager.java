package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myFrame12 extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField tf1, tf2, tf3;
    Panel mainP, p1, p2, cP;
    Checkbox c1, c2;
    CardLayout cl;
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.getState())
            cl.first(mainP);
        else
            cl.last(mainP);
    }
    public myFrame12() {
        super("Cardlayout Demo");
        CheckboxGroup cbg = new CheckboxGroup();

        c1 = new Checkbox("Card-1", true, cbg);
        c2 = new Checkbox("Card-2", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);

        cP = new Panel();
        cP.add(c1);
        cP.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);

        mainP = new Panel();
        cl= new CardLayout();
        mainP.setLayout(cl);
        mainP.add("Card-1", p1);
        mainP.add("Card-2", p2);

        add(cP, BorderLayout.NORTH);
        add(mainP, BorderLayout.CENTER);
    }
}

public class layoutManager {
    public static void main(String[] args) {
        myFrame12 f = new myFrame12();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
