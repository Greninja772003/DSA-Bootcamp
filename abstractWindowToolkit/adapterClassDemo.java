package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame13 extends Frame {
    myFrame13() {
        super("Adapter Demo");
        addWindowListener(new myWindowAdapter() );
    }
    class myWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }
}

public class adapterClassDemo {
    public static void main(String[] args) {
        myFrame13 f = new myFrame13();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
