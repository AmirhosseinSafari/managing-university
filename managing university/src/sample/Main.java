package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    static ArrayList<Class> classeslist = new ArrayList<>();
    static ArrayList<Professor> professorslist = new ArrayList<>();
    static ArrayList<Student> studentslist = new ArrayList<>();
    static Manager manager = new Manager("ali","akbari","0123" , 53);

    @Override
    public void start(Stage primaryStage) throws Exception{

        Class mathClass = new Class("math2","202 madan" , "SAT 8:00" , "6565");
        Class physicsClass = new Class("Physic2" , "213 madan" , "SUN 9:30" , "4545");
        Class statisticsClass = new Class("statistics" , "105 bargh" , "SUN 2:00" , "7575");
        Class advanceProgrammingClass = new Class("adv.prog" , "104 bargh" , "WED 8:00" , "1515");

        Professor professor1 = new Professor("saeed","rahmani","963", 37 , "advanceProgramming professor");
        Professor professor2 = new Professor("saeed","mirzaee mazraee","741", 36 , "math professor");
        Professor professor3 = new Professor("somaye","taran","852", 38 , "physics professor");
        Professor professor4 = new Professor("majid","heydari","456", 39 , "statistics professor");

        Student s1 = new Student("amirhossein" , "safari" , "3137" , 19);
        Student s2 = new Student("shervin" , "dadash zade" , "3199" , 19);
        Student s3 = new Student("ali" , "karimi" , "3145" , 19);
        Student s4 = new Student("nima" , "meghdadi" , "3160" , 19);

        StudentGrades student1 = new StudentGrades(s1,0);
        StudentGrades student2 = new StudentGrades(s2,0);
        StudentGrades student3 = new StudentGrades(s3,0);
        StudentGrades student4 = new StudentGrades(s4,0);

        professor1.professorClasses.add(advanceProgrammingClass);
        professor2.professorClasses.add(mathClass);
        professor3.professorClasses.add(physicsClass);
        professor4.professorClasses.add(statisticsClass);

        mathClass.students.add(student1);
        mathClass.students.add(student2);
        mathClass.students.add(student3);
        mathClass.students.add(student4);

        physicsClass.students.add(student2);
        physicsClass.students.add(student4);

        advanceProgrammingClass.students.add(student1);
        advanceProgrammingClass.students.add(student2);
        advanceProgrammingClass.students.add(student3);
        advanceProgrammingClass.students.add(student4);

        statisticsClass.students.add(student2);
        statisticsClass.students.add(student3);

        s1.studentClasses.add(mathClass);
        s1.studentClasses.add(advanceProgrammingClass);

        s2.studentClasses.add(mathClass);
        s2.studentClasses.add(physicsClass);
        s2.studentClasses.add(advanceProgrammingClass);
        s2.studentClasses.add(statisticsClass);

        s3.studentClasses.add(mathClass);
        s3.studentClasses.add(advanceProgrammingClass);
        s3.studentClasses.add(statisticsClass);

        s4.studentClasses.add(mathClass);
        s4.studentClasses.add(physicsClass);
        s4.studentClasses.add(advanceProgrammingClass);


        classeslist.add(mathClass);
        classeslist.add(physicsClass);
        classeslist.add(statisticsClass);
        classeslist.add(advanceProgrammingClass);

        professorslist.add(professor1);
        professorslist.add(professor2);
        professorslist.add(professor3);
        professorslist.add(professor4);

        studentslist.add(s1);
        studentslist.add(s2);
        studentslist.add(s3);
        studentslist.add(s4);



        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 634, 448));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
