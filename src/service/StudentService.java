// Business logic layer for managing Student operations
package service;

import model.Student;
import java.util.*;

import exceptions.InvalidStudentDataException;
import util.StudentValidator;

public class StudentService {

    // Creating a Map using Encapsulation Access Modifier to Store Student Data Based on Key,Value
    private Map<Integer, Student> studentMap = new HashMap<>();

    // A Method to Add the Student Data
    public boolean addStudent(Student student) {
        StudentValidator.validateId(student.getId());
        StudentValidator.validateName(student.getName());
        StudentValidator.validateMarks(student.getMarks());

        if (studentMap.containsKey(student.getId())) {
            return false;
        }
        studentMap.put(student.getId(), student);
        return true;
    }

    // A Method to Remove the Student Data
    public boolean deleteStudent(int id) {
        if (!(studentMap.containsKey(id))) {
            throw new InvalidStudentDataException("Student ID not found");
        }

        studentMap.remove(id);
        return true;

    }

    // A Method to Update or Modify Student Marks Data
    public boolean updateStudentMarks(int id, int marks) {

        StudentValidator.validateId(id);

        StudentValidator.validateMarks(marks);

        Student student = studentMap.get(id);

        if (student == null) {
            throw new InvalidStudentDataException("Student ID not found");
        }

        student.setMarks(marks);
        return true;

    }

    // A Method to Update or modify Student Name
    public boolean updateStudentName(int id, String name) {

        StudentValidator.validateId(id);
        StudentValidator.validateName(name);

        Student student = studentMap.get(id);

        if (student == null) {
            throw new InvalidStudentDataException("Student ID not found");
        }

        student.setName(name);
        return true;
    }

    // A Method To Display Student Details by Student ID
    public Student getStudent(int id) {
        if (!(studentMap.containsKey(id))) {
            throw new InvalidStudentDataException("Student ID not found");
        }
        Student student = studentMap.get(id);
        return student;
    }

    // A Method to Check whether Student data Exists or Not based on Student ID
    public boolean studentExists(int id) {
        StudentValidator.validateId(id);

        return studentMap.containsKey(id);

    }

    // A Method To Display All the Student Data Already Stored
    public Collection<Student> getAllStudents() {

        if (studentMap.isEmpty()) {
            return Collections.emptyList();
        }

        return Collections.unmodifiableCollection(studentMap.values());

    }

}