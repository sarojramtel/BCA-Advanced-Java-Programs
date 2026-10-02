import javax.swing.*;

public class StudentInfo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Information");

        JLabel name = new JLabel("Name: Ram");
        JLabel age = new JLabel("Age: 20");
        JLabel course = new JLabel("Course: BCA");

        frame.setLayout(null);

        name.setBounds(50, 30, 200, 30);
        age.setBounds(50, 70, 200, 30);
        course.setBounds(50, 110, 200, 30);

        frame.add(name);
        frame.add(age);
        frame.add(course);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}