package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class myFrame9 extends Frame implements KeyListener {
    Label l1, l2, l3, l4;

    myFrame9() {
        super("Key Event Demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");
        setLayout(null);
        l1.setBounds(30, 10, 100, 15);
        l2.setBounds(30, 40, 100, 15);
        l3.setBounds(30, 70, 100, 15);
        l4.setBounds(30, 100, 200, 15);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);
    }

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen()) + " ");
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
    }
//public void keyPressed(KeyEvent e){

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");

    }
}

public class keyEventDemo {
    public static void main(String[] args) {
        myFrame9 f = new myFrame9();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
