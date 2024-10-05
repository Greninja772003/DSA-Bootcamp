package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class myFrame11 extends Frame implements WindowListener {
    Label l;
    myFrame11() {
        super("Window Event Demo");
        l = new Label("                       ");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class windowEventDemo {
    public static void main(String[] args) {
        myFrame11 f = new myFrame11();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
