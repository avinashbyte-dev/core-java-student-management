package main;


import java.util.Scanner;

import exceptions.InvalidStudentDataException;

import java.util.Collection;

import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        // Created a Reference Object Using StudentService Class
        StudentService studentService = new StudentService();

        // Creating a Menu-Driven Console App

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println(
                    "1. Add Student\n2. Delete Student\n3. Update Student Name\n4. Update Student Marks\n5. View Student by ID\n6. View All Students\n7. Check Student Exists\n8. Exit");

            System.out.print("Choosen One:");
            int choice = sc.nextInt();

            int id;
            String name;
            int marks;

            switch (choice) {
                case 1:
                    // Adding First Student Data
                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    System.out.print("Enter Name:");
                    sc.nextLine();
                    name = sc.nextLine();

                    if (name == null || name.isBlank()) {
                        System.out.println("Enter Valid Name..");
                        break;
                    }

                    System.out.print("Enter Marks:");
                    marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Enter Valid Marks..");
                        break;
                    }

                    try {
                        Student student = new Student(id, name, marks);

                        if (studentService.addStudent(student)) {
                            System.out.println("Added Student Data Successfully");
                        } else {
                            System.out.println("Student with this ID already exists");
                        }

                    } catch (InvalidStudentDataException e) {
                        System.out.println("Validation Error: " + e.getMessage());
                    }

                    break;

                case 2:
                    // Deleting or Removing the Student Data Based on Student ID
                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    if (studentService.deleteStudent(id) == true) {
                        System.out.println("SuccessFully Removed Student Data..");
                    } else {
                        System.out.println("Student ID doesn't Exist's in DataBase..");
                    }
                    break;

                case 3:

                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    System.out.print("Enter Name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    if (name == null || name.isBlank()) {
                        System.out.println("Enter Valid Name..");
                        break;
                    }

                    // Updating Student Name based on Student ID
                    try {
                        if (studentService.updateStudentName(id, name)) {
                            System.out.println("Name Has Been Updated..");
                        } else {
                            System.out.println("Entered Invalid ID!!");
                        }

                    } catch (InvalidStudentDataException e) {
                        System.out.println("Validation Error: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    System.out.print("Enter Marks:");
                    marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Enter Valid Marks..");
                        break;
                    }

                    // Updating Student Marks Based on Student ID
                    try {
                        if (studentService.updateStudentMarks(id, marks)) {
                            System.out.println("Marks Has Been Updated..");
                        } else {
                            System.out.println("Entered Invalid ID!!");
                        }
                    } catch (InvalidStudentDataException e) {
                        System.out.println("Validation Error: " + e.getMessage());
                    }

                    break;

                case 5:
                    // Fetching Student Details Based on Particular ID
                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    Student s = studentService.getStudent(id);

                    if (s == null) {
                        System.out.println("ID Not Found!!");
                    } else {
                        System.out.println(s);
                    }
                    break;

                case 6:
                    // Showing All Students Details
                    Collection<Student> students = studentService.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student st : students) {
                            System.out.println(st);
                        }
                    }
                    break;
                case 7:
                    // Student Exists in the DataBase
                    System.out.print("Enter Student ID:");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("ID must be positive");
                        break;
                    }

                    if (studentService.studentExists(id)) {
                        System.out.println("Student Exists..");
                    } else {
                        System.out.println("Student Does Not Exists..");
                    }
                    break;

                case 8:
                    // Exiting Application
                    System.out.println("Exiting Application...");
                    sc.close();
                    return;

                default:
                    // Invalid Choice Entered
                    System.out.println("Invalid Choice! Try Again!!");

            }

        }

    }
}
