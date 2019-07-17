package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ScoreGivingController implements Initializable {
    public Button saveBTN;
    public Label hiddenLBLSetScore;
    public TextField TextFeildOfScoreEntration;

    Main main = new Main();
    StudentsOFClassController s = new StudentsOFClassController();

    public void getScoreSAveBTN(ActionEvent actionEvent) {
        main.classeslist.
                get(s.numberOfClassINArraylist).students.get(s.numberOfStudentINArrraylist).setGrade(Float.parseFloat(TextFeildOfScoreEntration.getText()));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hiddenLBLSetScore.setText(main.classeslist.
                get(s.numberOfClassINArraylist).students.get(s.numberOfStudentINArrraylist).getStudent().getFirstName()
        + " " + main.classeslist.
                get(s.numberOfClassINArraylist).students.get(s.numberOfStudentINArrraylist).getStudent().getLastName() + "'s score");
    }
}
