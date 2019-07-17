package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassesOfStudentController implements Initializable {
    public ListView viewlistOfAllCourses;
    public ListView viewlistOfYourCourses;
    public TextField TextOfCourseID;
    public Button addCourseINClasesOFStudent;
    public Button removeCourseINClasesOFStudent;
    public Button refreshINClasesOFStudent;
    public Label hiddenLBLYourCourse;

    Main main = new Main();
    StudentLoginPageController s = new StudentLoginPageController();


    public void addCourseBTN(ActionEvent actionEvent) {
        for(int counter = 0 ; counter<main.classeslist.size() ; counter++){

            if(main.classeslist.get(counter).getId().equals(TextOfCourseID.getText())) {
                main.studentslist.get(s.numberOfStudentInArraylist).studentClasses
                        .add(main.classeslist.get(counter));
                break;
            }//end of if

        }

    }

    public void removeCourseBTN(ActionEvent actionEvent) {

        for(int counter = 0 ; counter<main.studentslist.get(s.numberOfStudentInArraylist).studentClasses.size() ; counter++){

            if(main.studentslist.get(s.numberOfStudentInArraylist).studentClasses.get(counter).getId().equals(TextOfCourseID.getText())){
                main.studentslist.get(s.numberOfStudentInArraylist).studentClasses.remove(counter);
                break;
            }//end of if
        }

    }

    public void refreshBTN(ActionEvent actionEvent) {

        viewlistOfYourCourses.getItems().clear();

        for(int counter = 0 ; counter<main.studentslist.get(s.numberOfStudentInArraylist).studentClasses.size() ; counter++){
            viewlistOfYourCourses.getItems().addAll(main.studentslist.get(s.numberOfStudentInArraylist).studentClasses
                    .get(counter).anotherToString());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        hiddenLBLYourCourse.setText(main.studentslist.get(s.numberOfStudentInArraylist).getFirstName()
                + " " + main.studentslist.get(s.numberOfStudentInArraylist).getLastName() + "'s courses");

        for(int counter = 0 ; counter<main.studentslist.get(s.numberOfStudentInArraylist).studentClasses.size() ; counter++){
            viewlistOfYourCourses.getItems().addAll(main.studentslist.get(s.numberOfStudentInArraylist).studentClasses
                    .get(counter).anotherToString());
        }

        for(int counter = 0 ; counter<main.classeslist.size() ; counter++){
            viewlistOfAllCourses.getItems().addAll(main.classeslist.get(counter).anotherToString());
        }
    }
}
