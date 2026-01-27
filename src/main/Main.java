package main;

import java.util.Collection;

import model.Student;
import service.StudentService;

public class Main{
    public static void main(String[] args){
    // Created a Reference Variable Using Student Class 
        Student student1 = new Student(1,"Avinash",85);
        Student student2 = new Student(2,"Ravi",97);
       
    // Created a Reference Variable Using StudentService Class
        StudentService studentservice = new StudentService();

    // Adding First Student Data
        if(studentservice.addStudent(student1)){
            System.out.println("Added Student Data Successfully");
        }
        else{
            System.out.println("This ID already exists in DataBase..");
        }

    // Adding Second Student Data
        if(studentservice.addStudent(student2)){
            System.out.println("Added Student Data Successfully");
        }
        else{
            System.out.println("This ID already exists in DataBase..");
        }
  
    // Deleting or Removing the Student Data Based on Student ID
        if(studentservice.deleteStudent(1) == true){
            System.out.println("SuccessFully Remove Student Data..");
        }
        else{
            System.out.println("Student ID doesn't Exist's in DataBase..");
        }

    // Updating Student Name based on Student ID
        if(studentservice.updateStudentName(1, "Hari")){
            System.out.println("Name Has Been Updated..");
        }
        else{
            System.out.println("Entered Invalid ID!!");
        }

    // Updating Student Marks Based on Student ID
        if(studentservice.updateStudentMarks(1, 95)){
            System.out.println("Marks Has Been Updated..");
        }
        else{
            System.out.println("Entered Invalid ID!!");
        }
        

    // Showing All Students Details
        Collection<Student> students = studentservice.getAllStudents();

        for(Student s : students){
            System.out.println(s);
        }

    // Fetching Student Details Based on Particular ID
        if(studentservice.getStudent(5) == null){
            System.out.println("ID Not Found!!");
        }
        else{
            System.out.println(studentservice.getStudent(5));
        }

    // Checking Whether Student Data is Available or Not Based on ID
        if(studentservice.studentExists(1)){
            System.out.println("Student Data Available");
        }
        else{
            System.out.println("Student Data Not Available");
        }
        
        


        


    }
}
