package sample;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<Class> studentClasses = new ArrayList<>();


    public Student(String firstName, String lastName, String id, int age) {
        super(firstName, lastName, id, age);
    }

    @Override
    public String toString() {
        String str = String.format("%s %s %s %d",getFirstName(),getLastName(),getId(),getAge());
        return str;
    }

    public String getCourse(ArrayList<Class> courses){

        String str1 = String.format("%s %s %d %d\n",getFirstName(),getLastName(),getId(),getAge());
        String str2 = null;

        for(Class course : courses) {
            studentClasses.add(course);
            str2 += course.getName() + "\n";
        }
        return str1 + str2;
    }


    public String removeACourse(String course){

        String str1 = String.format("%s %s %d %d",getFirstName(),getLastName(),getId(),getAge());
        String str2 = null;

        for(Class crs : studentClasses){
            if(!(crs.getName().equals(course))){
                str2 += crs.getName() + "\n";
            }
        }
        return str1 + str2;
    }


    public String totalCourses(){

        String str = null;
        for(Class crs : studentClasses){
            str += crs.getName() + "\n";
        }
        return str;
    }
}

