package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame15 extends Frame {
    Menu file, sub;
    MenuItem open, save, close, closeall;
    CheckboxMenuItem auto;
    TextField tf;

    myFrame15() {
        super("Menu Demo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeall.addActionListener((ActionEvent ae) -> tf.setText("Close All"));

        auto.addItemListener((ItemEvent ie) -> {
            if (auto.getState())
                tf.setText("Auto On");
            else
                tf.setText("Auto Off");
        });
    }

    class myWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}


public class menuDemo {
    public static void main(String[] args) {
        myFrame15 f = new myFrame15();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
