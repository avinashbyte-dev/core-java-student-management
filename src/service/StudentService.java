package service;
import model.Student;
import java.util.*;

public class StudentService {

// Creating a Map using Encapsulation Access Modifier to Store Student Data Based on Key,Value  
private Map <Integer, Student> studentMap = new HashMap<>();

    // Creating a Method to Add the Student Data
    public void addStudent(Student student){
        if(studentMap.containsKey(student.getId())){
            System.out.println("Note: ID:"+ student.getId() +","+"This ID already exists in DataBase..");
            return;
        }
        else{
        studentMap.put(student.getId(),student);
        }
    }

    // Creating a Method to Remove the Student Data
    public void deleteStudent(int id){
        if(studentMap.containsKey(id)){
            studentMap.remove(id);
            System.out.println("Deleted Student Data From DataBase.");
        }
        else{
            System.out.println("ID Not Found in DataBase..");
        }
    }

    // Creating a Method to Update or Modify Student Marks Data
    public void updateStudentMarks(int id , int marks){
        Student student = studentMap.get(id);
        if(student != null) {
            student.setMarks(marks);
        }
        else{
            System.out.println("ID doesn't exists in DataBase");
        }
    }

    // Creating a Method To Display Student Details by Student ID
    public void displayStudentDetails(int id) {
        if(studentMap.containsKey(id)){
                Student student = studentMap.get(id);
                System.out.println(student);
        }
        else{
            System.out.println("Given ID doesn't exists in DataBase");
        }


    }

    // Creating a Method To Display All the Student Data Already Stored 
    public void displayAllStudentDetails(){
        if(studentMap.isEmpty()){
            System.out.println("No Data Available..");
        }
        else{
        System.out.println(studentMap.values());
        }
    }


}