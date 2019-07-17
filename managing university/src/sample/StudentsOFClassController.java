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

public class StudentsOFClassController implements Initializable {
    public Button removeStudentInStudentsOfClass;
    public Button scoreOfStudentInStudentsOfClass;
    public TextField studentIDInStudentsOFClass;
    public ListView viewListOfStudentsInStudentOfClass;
    public Label titleOfViewlistStudentsOfClass;
    public Button refreshBTN;

    ClassesOfProfessorController professorController = new ClassesOfProfessorController();
    Main main = new Main();
    static int numberOfClassINArraylist = 0;
    static int numberOfStudentINArrraylist = 0;

    public void scoreEntrationBTN(ActionEvent actionEvent) {
        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("scoreGiving.fxml"));
            primaryStage.setScene(new Scene(root, 411, 302));
            primaryStage.setTitle("Score Of Student");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeStudentBTN(ActionEvent actionEvent) {

        for(int counter = 0 ; counter<main.classeslist.get(numberOfClassINArraylist).students.size() ; counter++){
            if(main.classeslist.get(numberOfClassINArraylist).students.get(counter).getStudent().getId().equals(studentIDInStudentsOFClass.getText())){
                numberOfStudentINArrraylist = counter;
            }
        }//end of for

        main.classeslist.get(numberOfClassINArraylist).students.remove(numberOfStudentINArrraylist);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        for (int counter = 0; counter < main.classeslist.size(); counter++) {
            if (main.classeslist.get(counter).getId().equals(professorController.textFeildOfProfessorClasses.getText())) {
                titleOfViewlistStudentsOfClass.setText("Students Of " + main.classeslist.get(counter).getName() + " Class");
                numberOfClassINArraylist = counter;
                break;
            }
        }

        for (int counter = 0 ; counter<main.classeslist.size() ; counter++){

            viewListOfStudentsInStudentOfClass.getItems().addAll(main.classeslist.get(numberOfClassINArraylist).students.get(counter));
        }

    }

    public void refreshInStuentOfClasses(ActionEvent actionEvent) {

        viewListOfStudentsInStudentOfClass.getItems().clear();

        for (int counter = 0 ; counter<main.classeslist.size() ; counter++){
            viewListOfStudentsInStudentOfClass.getItems().addAll(main.classeslist.get(numberOfClassINArraylist).students.get(counter));
        }
    }
}
