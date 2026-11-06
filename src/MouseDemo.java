import javax.swing.*;
import java.awt.event.*;

public class MouseDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("MouseListener");

        JButton b = new JButton("Move Mouse Here");
        b.setBounds(80, 80, 180, 40);

        b.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }

        });

        f.add(b);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}