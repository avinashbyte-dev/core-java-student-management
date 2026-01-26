import model.Student;
import service.StudentService;

public class Main{
    public static void main(String[] args){
        // Created a Reference Variable Using Student Class 
        Student student1 = new Student(1,"Avinash",85);
        Student student2 = new Student(2,"Ravi",97);
       
        // Created a Reference Variable Using StudentService Class
        StudentService studentservice = new StudentService();

        // Calling addStudent() Method to add the Students Data
        studentservice.addStudent(student1);
        studentservice.addStudent(student2);
  
        // Calling deleteStudent() Method to Delete or Remove the Student Data
        studentservice.deleteStudent(1);

        // Calling displayAllStudentDetails() Method to Display All Students Data
        studentservice.displayAllStudentDetails();

        // Calling displayingStudentDetails() Method to Display a Particular Student Data Using unique ID
        studentservice.displayStudentDetails(5);

        


        


    }
}
