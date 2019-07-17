package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginManagerController {
    public TextField usernameManagerLogin;
    public TextField idManagerLogin;
    public Label hiddenLabelManagerLogin;
    public Button loginManagerBTN;

    public void btnSignInManagerLogin(ActionEvent actionEvent) {
        Main main = new Main();

        if (usernameManagerLogin.getText().equals(main.manager.getFirstName() + " " + main.manager.getLastName()) && idManagerLogin.getText().equals(String.valueOf(main.manager.getId()))) {
            try {
                Stage ex = (Stage) loginManagerBTN.getScene().getWindow();
                ex.close();

                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("managerPage.fxml"));
                primaryStage.setScene(new Scene(root, 634, 448));
                primaryStage.setTitle("Manager");
                primaryStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            hiddenLabelManagerLogin.setText("Username or id is Wrong!");
        }
    }
}

