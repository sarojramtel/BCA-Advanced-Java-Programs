package swing.mvc2;

import javax.swing.*;

public class StudentView {

    JFrame frame;
    JList<String> hobbyList;
    JCheckBox checkBox;
    JButton submitButton;
    JLabel resultLabel;

    public StudentView() {

        frame = new JFrame("Student Hobby");

        frame.setSize(350, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Select Hobby:");
        label.setBounds(30, 20, 150, 25);
        frame.add(label);

        String hobbies[] = {"Reading", "Music", "Sports"};

        hobbyList = new JList<>(hobbies);
        hobbyList.setBounds(30, 50, 120, 70);
        frame.add(hobbyList);

        checkBox = new JCheckBox("I like Programming");
        checkBox.setBounds(30, 130, 200, 25);
        frame.add(checkBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(30, 170, 100, 30);
        frame.add(submitButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(30, 210, 280, 25);
        frame.add(resultLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}