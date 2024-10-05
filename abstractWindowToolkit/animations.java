package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame17 extends Frame implements Runnable{
    int x,y,tx,ty;
    myFrame17(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        x=100;
        y=100;
        tx=ty=1;
        Thread t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true){
            x+=tx;
            y+=ty;
            if (x<0||x>450)
                tx=tx*(-1);
            if (y<0|| y>350)
                ty=ty*(-1);
            repaint();
            try {
                Thread.sleep(3);
            }catch (Exception e){}
        }
    }
}
public class animations {
    public static void main(String[] args) {
        myFrame17 f = new myFrame17();
        f.setSize(500, 450);
        f.setVisible(true);
    }
}
