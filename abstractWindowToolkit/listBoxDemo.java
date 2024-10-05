package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;


class myFrame5 extends Frame implements ItemListener, ActionListener{
    List l;
    Choice c;
    TextArea ta;

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[]= l.getSelectedItems();
        String txt = "";
        for (String x:list)
            txt=x+"\n";
        ta.setText(txt);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    public myFrame5() throws HeadlessException {
        super("ListBox Demo");
        l= new List(4,true);
        c= new Choice();
        ta = new TextArea(20,30);
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }
}

public class listBoxDemo {
    public static void main(String[] args) {
        myFrame5 f = new myFrame5();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
