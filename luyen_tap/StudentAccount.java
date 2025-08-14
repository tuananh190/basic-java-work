package luyen_tap;
import java.util.Scanner;
public class StudentAccount {
    private String studentName;
    private String studentId;
    private double gpa;

    public StudentAccount(String studentName, String studentId, double gpa){
        this.studentName = studentName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setStudentName( String studentName) {
        if (studentName != null && !studentName.isEmpty()){
            this.studentName = studentName;
        }else {
            System.out.println("Student name cannot be null or empty!");
        }
    }

    public void setStudentId( String studentId) {
        if (studentId != null && !studentId.isEmpty()){
            this.studentId = studentId;
        }else {
            System.out.println("Student id cannot be null or empty!");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }else{
            System.out.println("gpa need to between from 0.0 to 4.0");
        }
    }

    public void updateGpa(double newGpa){
        if (newGpa >= 0.0 && newGpa <= 4.0){
            this.gpa = newGpa;
        }else{
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0");
        }
    }
    public void printStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }
}


