package sample;

import java.util.ArrayList;

public class Professor extends Person {

    private String expertise;
    ArrayList<Class> professorClasses = new ArrayList<>();

    public Professor(String firstName, String lastName, String id, int age , String expertise) {
        super(firstName, lastName, id, age);
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        String str = String.format("%s %s %s %d %s\n",getFirstName(),getLastName(),getId(),getAge(),getExpertise());
        return str;
    }

    public String professorClasses(ArrayList<Class> classCourse){

        String str = null;
        for (Class classes : classCourse){
            professorClasses.add(classes);
            str += classes.getName() + "\n";
        }
        return str;
    }


    public String getExpertise() {                      //getter and setter
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }                                                   //*


}

