package abstractWindowToolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class myFrame4 extends Frame implements TextListener, ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;


    @Override
    public void actionPerformed(ActionEvent e) {
//        l.setText(ta.getSelectedText());
//        ta.append(tf.getText());
        ta.insert(tf.getText(),ta.getCaretPosition());
    }



    @Override
    public void textValueChanged(TextEvent e) {

    }

    public myFrame4() {
        super("TextArea Demo");
        l = new Label("Not Text Entered");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Click");
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
}
public class textAreaDemo {
    public static void main(String[] args) {
        myFrame4 f = new myFrame4();
        f.setSize(500,500);
        f.setVisible(true);
    }
}

