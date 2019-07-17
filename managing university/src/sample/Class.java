package sample;

import java.util.ArrayList;

public class Class {

    private String name;
    private String numberOfRoom;
    private Professor professor;
    private String date;
    private String id;

    ArrayList<StudentGrades> students = new ArrayList<>();


    public Class(String name, String numberOfRoom, String date, String id) {
        this.name = name;
        this.numberOfRoom = numberOfRoom;
        this.date = date;
        this.id = id;
    }

    @Override
    public String toString() {
        String str = String.format("%s\t\t\t\t\t\t\t   %s\t\t\t\t\t\t\t   %s\t\t\t\t\t\t\t   %s",getName(),getNumberOfRoom(),getDate(),getId());
        return str;
    }

    public String anotherToString (){
        String str = String.format("%s\t\t\t\t %s\t\t\t\t %s\t\t\t\t %s",getName(),getNumberOfRoom(),getDate(),getId());
        return str;
    }


    public void addStudent(StudentGrades student){
        this.students.add(student);
    }


    public String studentsName (ArrayList<Student> students) {
        String str = null;

        for (Student student : students) {
            str += student.getFirstName() + student.getLastName() + "\n";
        }
        return str;
    }

    public ArrayList<StudentGrades> getStudents() {                 //getter and setter
        return students;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStudents(ArrayList<StudentGrades> students) {
        this.students = students;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {                                 //*
        this.id = id;
    }


}
