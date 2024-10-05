package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class myFrame6 extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue, yellow;
    TextField tf;

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue(), yellow.getValue()));
    }

    myFrame6() {
        super("Scroll Bar Demo");
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 40, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 40, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 40, 0, 255);
        yellow = new Scrollbar(Scrollbar.HORIZONTAL, 0, 40, 0, 255);
        tf = new TextField(20);
        tf.setBounds(50, 50, 300, 50);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);
        yellow.setBounds(50, 250, 300, 30);
        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        add(yellow);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        yellow.addAdjustmentListener(this);
    }
}

public class scrollDemo {
    public static void main(String[] args) {
        myFrame6 f = new myFrame6();
        f.setSize(700, 700);
        f.setVisible(true);
    }
}
