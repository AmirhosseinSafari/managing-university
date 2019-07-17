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

public class AllClassesForManagerController implements Initializable {
    public ListView listViewOfAllClasses;
    public TextField textFeildOfAllClasses;
    public Button allClassesBTN;
    public Label hiddenLBL;

    Main main = new Main();
    static int numberOfCourseINArraylist = 0;

    public void allClassesBTNForManager(ActionEvent actionEvent) {

        boolean found = false;

        for(int counter = 0 ; counter<main.classeslist.size() ; counter++){
            if(main.classeslist.get(counter).getId().equals(textFeildOfAllClasses.getText())){
                numberOfCourseINArraylist = counter;
                found = true;
                break;
            }
        }//end of for

        if(found == true){

            try {
                Stage ex = (Stage) allClassesBTN.getScene().getWindow();
                ex.close();

                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource(".fxml"));
                primaryStage.setScene(new Scene(root, 491, 599));
                primaryStage.setTitle("Student's Of Class");
                primaryStage.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }//end of if
        else {
            hiddenLBL.setText("Any class with this ID not found...\nPlease check it again");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for(int counter = 0 ; counter<main.classeslist.size()  ; counter++){
            listViewOfAllClasses.getItems().addAll(main.classeslist.get(counter));
        }
    }
}
