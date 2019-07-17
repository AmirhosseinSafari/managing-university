package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ManagerPageController {

    public void btnListOfAllClasses(ActionEvent actionEvent) {

        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("allClassesForManager.fxml"));
            primaryStage.setScene(new Scene(root, 559, 613));
            primaryStage.setTitle("All courses");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void btnPresentingANewClass(ActionEvent actionEvent) {

        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("creatingANewClass.fxml"));
            primaryStage.setScene(new Scene(root, 568, 470));
            primaryStage.setTitle("Creating A New Class");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void btnHireAProfessor(ActionEvent actionEvent) {

        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("hireAProfessor.fxml"));
            primaryStage.setScene(new Scene(root, 568, 470));
            primaryStage.setTitle("Hire A Professor");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void btnRegisterANewStudent(ActionEvent actionEvent) {

        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("registerNewStudent.fxml"));
            primaryStage.setScene(new Scene(root, 568, 413));
            primaryStage.setTitle("Register A Student");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
