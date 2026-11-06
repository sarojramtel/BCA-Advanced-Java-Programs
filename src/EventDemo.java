import javax.swing.*;
import java.awt.event.*;

public class EventDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);
        // Register event listener
        button.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        frame,
                        "Button Clicked!"
                );
        });
        frame.add(button);
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}