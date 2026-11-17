package swing.mvc;

import java.awt.event.*;

public class StudentController {

    StudentModel model;
    StudentView view;

    public StudentController(StudentModel model,
                             StudentView view) {

        this.model = model;
        this.view = view;

        view.showButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = view.nameField.getText();

                model.setName(name);

                view.resultLabel.setText(
                        "Welcome " + model.getName() + "!"
                );
            }
        });
    }
}