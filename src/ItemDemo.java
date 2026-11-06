import javax.swing.*;
import java.awt.event.*;

public class ItemDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("ItemListener");

        JCheckBox cb = new JCheckBox("I agree");
        cb.setBounds(100, 80, 150, 40);

        cb.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {

                if (cb.isSelected()) {
                    System.out.println("Checkbox Selected");
                } else {
                    System.out.println("Checkbox Unselected");
                }

            }
        });

        f.add(cb);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}