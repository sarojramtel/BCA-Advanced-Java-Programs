import javax.swing.*;

public class TextAreaExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Details");

        JTextArea textArea = new JTextArea();

        textArea.setText(
                "Student Information\n" +
                        "-------------------\n" +
                        "Name: Ram\n" +
                        "Age: 20\n" +
                        "Course: BCA\n" +
                        "College: ABC College"
        );

        frame.add(textArea);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}