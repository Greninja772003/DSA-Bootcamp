package abstractWindowToolkit;
import java.awt.*;
import java.awt.event.*;

class myFrame3 extends Frame {
    Label l1,l2;
    TextField tf;
      public myFrame3(){
         super("TextField Demo");
         l1 = new Label("No Text is Entered Yet");
         l2 = new Label("Enter key is not yet hit");
         tf = new TextField(20);
         tf.setEchoChar('*');
         Handler h = new Handler();

         tf.addTextListener(h);
         tf.addActionListener( h);

         setLayout(new FlowLayout());
         add(l1);
         add(tf);
         add(l2);

     }
     class Handler implements TextListener,ActionListener{
         public void textValueChanged(TextEvent e) {
             l1.setText(tf.getText());
         }
         public void actionPerformed(ActionEvent e){
             l2.setText(tf.getText());
         }
     }
}
public class textFieldDemo {
    public static void main(String[] args) {
        myFrame3 f = new myFrame3();
        f.setSize(320,315);
        f.setVisible(true);
    }
}
