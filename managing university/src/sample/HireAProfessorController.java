package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HireAProfessorController {
    public TextField TextFirstName;
    public TextField TextLastName;
    public TextField TextID;
    public TextField TextAge;
    public TextField TextExpertise;
    public Button hireProfessorBTN;
    public Label hiddenLBLOfHireProfessor;

    Main main = new Main();

    public void hireProfessorBTNOfManager(ActionEvent actionEvent) {

        Professor newProfessor = new Professor(TextFirstName.getText(),TextLastName.getText(),TextID.getText(),
                Integer.parseInt(TextAge.getText()),TextExpertise.getText());

        main.professorslist.add(newProfessor);

        hiddenLBLOfHireProfessor.setText("New professor hired successfully...");

    }
}
