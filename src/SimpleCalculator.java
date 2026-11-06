import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {

        JFrame f = new JFrame("Simple Calculator");

        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel result = new JLabel("Result: ");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        // Setting positions
        l1.setBounds(30, 30, 120, 30);
        t1.setBounds(150, 30, 150, 30);

        l2.setBounds(30, 80, 120, 30);
        t2.setBounds(150, 80, 150, 30);

        add.setBounds(30, 140, 60, 40);
        sub.setBounds(100, 140, 60, 40);
        mul.setBounds(170, 140, 60, 40);
        div.setBounds(240, 140, 60, 40);

        result.setBounds(30, 210, 270, 30);

        // Addition
        add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                double sum = a + b;

                result.setText("Result: " + sum);
            }
        });

        // Subtraction
        sub.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                double difference = a - b;

                result.setText("Result: " + difference);
            }
        });

        // Multiplication
        mul.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                double product = a * b;

                result.setText("Result: " + product);
            }
        });

        // Division
        div.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                if (b == 0) {
                    result.setText("Cannot divide by zero!");
                } else {
                    double quotient = a / b;
                    result.setText("Result: " + quotient);
                }
            }
        });

        // Adding components
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);

        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);

        f.add(result);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}