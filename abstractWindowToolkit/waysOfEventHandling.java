package abstractWindowToolkit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame14 extends Frame  {
    TextField tf ;
    Button b;
    int count =0 ;
    class myListener implements ActionListener{
        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }
    myFrame14(){
        super("Event Demo");
        addWindowListener(new myWindowAdapter() );
        tf= new TextField("0",20);
        b=new Button("CLICK");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener ((ActionEvent ae)-> {
            count++;
        tf.setText(String.valueOf(count));
        });
    }

    class myWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }
}
public class waysOfEventHandling {
    public static void main(String[] args) {
        myFrame14 f = new myFrame14();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
