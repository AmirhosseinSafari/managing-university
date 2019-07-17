package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginProfessorController {
    public TextField usernameProfessorLogin;
    public TextField idProfessorLogin;
    public Label hiddenLabelProfessorLogin;
    public Button loginProfessorBTN;

    static int numberOfProfessorInArraylist;

    public void btnSignInProfessorLogin(ActionEvent actionEvent) {
        Main main = new Main();

        for(int counter = 0 ; counter<main.professorslist.size() ; counter++){
            if(usernameProfessorLogin.getText().equals(main.professorslist.get(counter).getFirstName() + " "
                    + main.professorslist.get(counter).getLastName()) &&
                    idProfessorLogin.getText().equals(main.professorslist.get(counter).getId())){

                numberOfProfessorInArraylist = counter;

                try {
                    Stage ex = (Stage) loginProfessorBTN.getScene().getWindow();
                    ex.close();

                    Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("classesOfProfessor.fxml"));
                    primaryStage.setScene(new Scene(root, 559, 614));
                    primaryStage.setTitle("Professor Classes");
                    primaryStage.show();
                }catch (Exception e){
                    e.printStackTrace();
                }

                break;
            }//end of if
            else {
                hiddenLabelProfessorLogin.setText("Username or id is Wrong!\nPlease check it again");
            }
        }//end of for


    }
}
