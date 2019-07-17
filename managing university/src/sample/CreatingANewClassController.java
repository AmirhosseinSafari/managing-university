package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreatingANewClassController {
    public TextField TextNameOfClass;
    public TextField TextNumberOfRoom;
    public TextField TextDateOfclass;
    public TextField TextIDOfClass;
    public TextField TextProfessorIDOfClass;
    public Button createClassBTN;
    public Label hiddenLBLOfCreatingNewClass;

    Main main = new Main();

    public void createClassBTNOfManager(ActionEvent actionEvent) {

        boolean found = false;

        for(int counter = 0 ; counter<main.professorslist.size() ; counter++) {
            if (main.professorslist.get(counter).getId().equals(TextProfessorIDOfClass.getText())) {

                Class newClass = new Class(TextNameOfClass.getText()
                        ,TextNumberOfRoom.getText(),TextDateOfclass.getText(),TextIDOfClass.getText());
                newClass.setProfessor(main.professorslist.get(counter));

                main.classeslist.add(newClass);

                found = true;
                break;
            }
        }//end of for

        if(found == false){
            hiddenLBLOfCreatingNewClass.setText("Any professor with this ID not found\n" +
                    "Notice that you should enter a ID of a professor that has hired before...");
        }
        else {
            hiddenLBLOfCreatingNewClass.setText("Class succsesfully created...");
        }

    }
}
