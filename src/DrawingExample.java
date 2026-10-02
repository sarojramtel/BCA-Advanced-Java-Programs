import javax.swing.*;
import java.awt.*;

public class DrawingExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawLine(50, 50, 200, 50);

        g.drawRect(50, 80, 150, 80);

        g.drawOval(50, 180, 100, 100);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Custom Drawing");

        DrawingExample panel = new DrawingExample();

        frame.add(panel);

        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}