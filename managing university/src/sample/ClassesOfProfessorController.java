package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassesOfProfessorController implements Initializable {
    public Button professorClassesBTN;
    public TextField textFeildOfProfessorClasses;
    public ListView listViewOfProfessorClasses;
    public Label nameOfProfessorInClassesOfProfessor;

    Main main = new Main();
    LoginProfessorController professorController = new LoginProfessorController();


    public void professorClassesBTN(ActionEvent actionEvent) {

        try {
            Stage ex = (Stage) professorClassesBTN.getScene().getWindow();
            ex.close();

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("studentsOFClass.fxml"));
            primaryStage.setScene(new Scene(root, 757, 600));
            primaryStage.setTitle("Students Of Class");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameOfProfessorInClassesOfProfessor.setText("Mr/Mrs." + main.professorslist.get(professorController.numberOfProfessorInArraylist).getFirstName()
        + " " + main.professorslist.get(professorController.numberOfProfessorInArraylist).getLastName() + " classes");

        for (int counter = 0; counter < main.professorslist.get(professorController.numberOfProfessorInArraylist).professorClasses.size(); counter++) {
            listViewOfProfessorClasses.getItems().addAll(main.professorslist.get(professorController.numberOfProfessorInArraylist)
                    .professorClasses.get(counter));
        }

    }

}