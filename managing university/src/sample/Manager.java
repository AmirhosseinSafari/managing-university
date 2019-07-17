package sample;

import java.util.ArrayList;

public class Manager extends Person{

    Manager(String firstName, String lastName, String id, int age){
        super(firstName, lastName, id, age);

    }

    @Override
    public String toString() {
        String str = String.format("%s %s %s %d",getFirstName(),getLastName(),getId(),getAge());
        return str;
    }


    public void addProfessor(String firstName, String lastName, String id, int age , String expertise){
        Professor professor = new Professor(firstName,lastName,id,age,expertise);
    }

    public void addStudent(String firstName, String lastName, String id, int age){
        Student student = new Student(firstName,lastName,id,age);
    }

    public String listOfClasses(ArrayList<Class> classCourse){
        String str = null;
        for(Class clss : classCourse){
            str += clss.getName();
        }
        return str;
    }

    public void infoOfClass(Class clss){
        String str = clss.getName() + " " + clss.getNumberOfRoom() + " " + clss.getDate();
        System.out.println(str);
    }



}