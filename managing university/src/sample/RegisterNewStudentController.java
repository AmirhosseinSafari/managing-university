package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterNewStudentController {
    public TextField TextFirstName;
    public TextField TextLastName;
    public TextField TextID;
    public TextField TextAge;
    public Button registerStudentBTN;
    public Label hiddenLBLOfStudent;

    Main main = new Main();

    public void registerStudentBTNOfStudent(ActionEvent actionEvent) {

        Student newStudent = new Student(TextFirstName.getText(),TextLastName.getText(),TextID.getText()
                ,Integer.parseInt(TextAge.getText()));

        main.studentslist.add(newStudent);

    }
}
