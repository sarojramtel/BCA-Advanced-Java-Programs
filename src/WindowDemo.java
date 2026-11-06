import javax.swing.*;
import java.awt.event.*;

public class WindowDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("WindowListener");

        f.addWindowListener(new WindowListener() {

            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("Window is Closing");
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("Window Minimized");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Restored");
            }

        });

        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }
}