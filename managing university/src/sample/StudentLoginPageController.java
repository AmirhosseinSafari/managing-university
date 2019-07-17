package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentLoginPageController {
    public TextField usernameStudentLogin;
    public TextField idStudentLogin;
    public Button loginStudentBTN;
    public Label hiddenLabelStudentLogin;

    static int numberOfStudentInArraylist;

    public void btnSignInStudentLogin(ActionEvent actionEvent) {

        Main main = new Main();

        for(int counter = 0 ; counter<main.studentslist.size() ; counter++){
            if(usernameStudentLogin.getText().equals(main.studentslist.get(counter).getFirstName() + " "
                    + main.studentslist.get(counter).getLastName()) &&
                    idStudentLogin.getText().equals(main.studentslist.get(counter).getId())){

                numberOfStudentInArraylist = counter;

                try {
                    Stage ex = (Stage) loginStudentBTN.getScene().getWindow();
                    ex.close();

                    Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("classesOfStudent.fxml"));
                    primaryStage.setScene(new Scene(root, 730, 624));
                    primaryStage.setTitle("Student Classes");
                    primaryStage.show();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                break;
            }//end of if
            else {
                hiddenLabelStudentLogin.setText("Username or id is Wrong!\nPlease check it again");
            }
        }//end of for
    }
}
