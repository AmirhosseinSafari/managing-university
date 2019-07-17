package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsOfClassForManagerController implements Initializable {
    public ListView viewListOfStudentsInStudentOfClass;
    public Label titleOfViewlistStudentsOfClass;

    Main main = new Main();
    AllClassesForManagerController c = new AllClassesForManagerController();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        titleOfViewlistStudentsOfClass.setText(main.classeslist.get(AllClassesForManagerController
                .numberOfCourseINArraylist).getName());

        for(int counter = 0 ; counter<main.classeslist.get(AllClassesForManagerController
                .numberOfCourseINArraylist).students.size() ; counter++){

            viewListOfStudentsInStudentOfClass.getItems().addAll(main.classeslist.get(AllClassesForManagerController
                    .numberOfCourseINArraylist).students.get(counter));
        }//end of for

    }
}
