package swing.mvc;

import javax.swing.*;

public class StudentView {

    JFrame frame;
    JTextField nameField;
    JButton showButton;
    JLabel resultLabel;

    public StudentView() {

        frame = new JFrame("MVC Example");

        frame.setSize(350, 200);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(30, 20, 100, 30);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(140, 20, 150, 30);
        frame.add(nameField);

        showButton = new JButton("Show");
        showButton.setBounds(100, 65, 100, 30);
        frame.add(showButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(100, 110, 200, 30);
        frame.add(resultLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}