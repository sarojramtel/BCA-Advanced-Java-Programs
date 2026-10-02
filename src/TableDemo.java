import javax.swing.*;
import java.awt.*;

public class TableDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Table");
        String[] columns = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "Ram", 20},
                {2, "Sita", 21},
                {3, "Hari", 19}
        };
        JTable table = new JTable(data, columns);
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(table);
        panel.setBounds(50, 50, 400,300);
        panel.add(scrollPane);
        frame.add(panel);

        String[] teacherColumns = {"ID", "Name", "Age"};
        Object[][] teacherData = {
                {1, "teach1", 20},
                {2, "teach2", 21},
                {3, "teach3", 19}
        };
        JTable teacherTable = new JTable(teacherData, teacherColumns);
        JPanel teacherPanel = new JPanel();
        JScrollPane teacherScrollPane = new JScrollPane(teacherTable);
        teacherPanel.setBounds(50, 400, 400,300);
        teacherPanel.add(teacherScrollPane);
        frame.add(teacherPanel);

        frame.setLayout(new GridLayout(2,1));
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
