package abstractWindowToolkit;
import java.awt.*;
import java.awt.event.*;

class myFrame1 extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;

    /**
     * Invoked when an action occurs.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+ count);
    }

    public myFrame1() throws HeadlessException {
        super("Button Demo");
        l= new Label("   "+ count);
        b= new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
}
public class buttonDemo {
    public static void main(String[] args) {
        myFrame1 f = new myFrame1();
        f.setSize(450, 500);
        f.setVisible(true);
    }
}
