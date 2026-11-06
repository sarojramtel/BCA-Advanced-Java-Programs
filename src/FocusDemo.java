import javax.swing.*;
import java.awt.event.*;

public class FocusDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("FocusListener");

        JTextField t = new JTextField();
        t.setBounds(70, 80, 200, 40);

        t.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                System.out.println("Text Field Gained Focus");
            }

            public void focusLost(FocusEvent e) {
                System.out.println("Text Field Lost Focus");
            }

        });

        f.add(t);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}