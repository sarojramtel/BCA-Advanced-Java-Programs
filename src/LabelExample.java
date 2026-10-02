import javax.swing.*;

public class LabelExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Information");

        JLabel label = new JLabel("Name: Ram | Age: 20 | Course: BCA");

        frame.add(label);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}