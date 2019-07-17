package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

    public Button managerMenuBTN;
    public Button studentMenuBTN;
    public Button professorMenuBTN;

    public void managerMenuEnteration(ActionEvent actionEvent) {

        try {
            Stage ex = (Stage) managerMenuBTN.getScene().getWindow();
            ex.close();

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("loginManager.fxml"));
            primaryStage.setScene(new Scene(root,634, 448));
            primaryStage.setTitle("Manager Login");
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void professorMenuEnteration(ActionEvent actionEvent) {
        try {
            Stage ex = (Stage) professorMenuBTN.getScene().getWindow();
            ex.close();

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("loginProfessor.fxml"));
            primaryStage.setScene(new Scene(root,643,448));
            primaryStage.setTitle("Professor Login");
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void studentMenuEnteration(ActionEvent actionEvent) {
        try {
            Stage ex = (Stage) studentMenuBTN.getScene().getWindow();
            ex.close();

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("studentLoginPage.fxml"));
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.setTitle("Student Login");
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
