import javax.swing.*;

public class StudentForm extends JFrame {
    JTextField nameField;
    JTextField ageField;
    JButton submitButton;
    public StudentForm() {
        setTitle("Student Form");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 40, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 40, 180, 30);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 90, 100, 30);
        ageField = new JTextField();
        ageField.setBounds(150, 90, 180, 30);
        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 140, 100, 30);
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(submitButton);
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            JOptionPane.showMessageDialog(
                    this,
                    "Name: " + name + "\nAge: " + age
            );
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}