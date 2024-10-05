package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame16 extends Frame {
    int x = 0, y = 0;

    myFrame16() {
        super("Painting");
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window has been closed.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("NoteWorthy", Font.BOLD, 30));
        g.drawString("Hi", x, y);
//        g.fillOval(x,y,10,5);
    }
}

public class painting {
    public static void main(String[] args) {
        myFrame16 f = new myFrame16();
        f.setSize(500, 450);
        f.setVisible(true);
    }
}
