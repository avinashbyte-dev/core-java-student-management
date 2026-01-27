package service;
import model.Student;
import java.util.*;

public class StudentService {

// Creating a Map using Encapsulation Access Modifier to Store Student Data Based on Key,Value  
private Map <Integer, Student> studentMap = new HashMap<>();

// A Method to Add the Student Data
    public boolean addStudent(Student student){
        if(studentMap.containsKey(student.getId())){
            return false;
        }
        studentMap.put(student.getId(),student);
    return true;
    }

// A Method to Remove the Student Data
    public boolean deleteStudent(int id){

        if(studentMap.containsKey(id)){
            studentMap.remove(id);
            return true;
        }

    return false;
    }

// A Method to Update or Modify Student Marks Data
    public boolean updateStudentMarks(int id , int marks){
        Student student = studentMap.get(id);

        if(student != null) {
            student.setMarks(marks);
            return true;
        }

    return false;
    }

//A Method to Update or modify Student Name
    public boolean updateStudentName(int id, String name){
        Student student = studentMap.get(id);

        if(student != null && name != null && !name.isBlank()){
            student.setName(name);
        return true;
        }

    return false;
    }


// A Method To Display Student Details by Student ID
    public Student getStudent(int id) {
        if(studentMap.containsKey(id)){
                Student student = studentMap.get(id);
                return student;
        }
    return null;
    }

// A Method to Check whether Student data Exists or Not based on Student ID
    public boolean studentExists(int id){
        if(studentMap.containsKey(id)){
            return true;
        }
    return false;
    }

// A Method To Display All the Student Data Already Stored 
    public Collection<Student> getAllStudents(){

        if(studentMap.isEmpty()){
           return Collections.emptyList();
        }
        
        return studentMap.values();
    }


}