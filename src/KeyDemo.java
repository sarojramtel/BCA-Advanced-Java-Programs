import javax.swing.*;
import java.awt.event.*;

public class KeyDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("KeyListener");

        JTextField t = new JTextField();
        t.setBounds(70, 80, 200, 40);

        t.addKeyListener(new KeyListener() {

            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }

            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }

            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }

        });

        f.add(t);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}