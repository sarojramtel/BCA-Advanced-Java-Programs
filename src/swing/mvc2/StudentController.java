package swing.mvc2;

import java.awt.event.*;

public class StudentController {

    StudentModel model;
    StudentView view;

    public StudentController(StudentModel model,
                             StudentView view) {

        this.model = model;
        this.view = view;

        view.submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String hobby = view.hobbyList.getSelectedValue();

                boolean programming = view.checkBox.isSelected();

                model.setHobby(hobby);
                model.setProgramming(programming);

                view.resultLabel.setText(
                        "Hobby: " + model.getHobby() +
                                ", Programming: " + model.getProgramming()
                );
            }
        });
    }
}