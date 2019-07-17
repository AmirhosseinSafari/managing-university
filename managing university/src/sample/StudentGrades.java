package sample;

public class StudentGrades {

    private Student student;
    private float grade;


    public StudentGrades(Student student, int garde){
        this.student = student;
        this.grade = garde;
    }

    @Override
    public String toString() {
        String str = String.format("%s\t\t\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t\t%f",
                this.student.getFirstName(),this.student.getLastName(),this.student.getId(),getGrade());
        return str;
    }


    public Student getStudent() {                       //getter and setter
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;                             //*
    }


}
