package abstractWindowToolkit;
import java.awt.*;
import  java.awt.event.*;
class myFrame2 extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    /**
     * Invoked when an item has been selected or deselected by the user.
     * The code written for this method performs the operations
     * that need to occur when an item is selected (or deselected).
     *
     * @param e the event to be processed
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
      String str="";
        if (c1.getState())
          str = str+ " " + c1.getLabel();
        if (c2.getState())
            str = str+ " " + c2.getLabel();
        if (c3.getState())
            str = str+ " " + c3.getLabel();
        if(str.isEmpty())
            str = "Nothing is Selected";
        l.setText(str);
    }

    public myFrame2(){
        super("Check Box Demo");
        l = new Label("Nothing is Selected");
        cbg = new CheckboxGroup();

        c1= new Checkbox("Java",false,cbg);
        c2= new Checkbox("Python",false,cbg);
        c3= new Checkbox("C#",false,cbg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());;
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
}
public class checkBoxDemo {
    public static void main(String[] args) {
        myFrame2 f = new myFrame2();
        f.setSize(350,300);
        f.setVisible(true);
    }
}
