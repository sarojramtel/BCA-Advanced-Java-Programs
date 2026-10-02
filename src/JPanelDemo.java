import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Demo");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Status: Ready");

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setSize(250, 150);
        frame.setVisible(true);
    }

}
