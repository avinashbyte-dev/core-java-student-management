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

        try (Scanner sc = new Scanner(System.in)) {
            int choice = 0;

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println(
                        "1. Add Student\n2. Delete Student\n3. Update Student Name\n4. Update Student Marks\n5. View Student by ID\n6. View All Students\n7. Check Student Exists\n8. Exit");

                try {
                    System.out.print("Choosen One:");
                    choice = Integer.parseInt(sc.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Enter Valid Input");
                    continue;
                  
                }

                int id = 0;
                String name;
                int marks = 0;

                switch (choice) {
                    case 1:
                        // Adding First Student Data

                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a number");
                            break;
                        }

                        try {
                            System.out.print("Enter Name:");

                            name = sc.nextLine();

                            System.out.print("Enter Marks:");
                            marks = Integer.parseInt(sc.nextLine());

                            Student student = new Student(id, name, marks);

                            if (studentService.addStudent(student)) {
                                System.out.println("Added Student Data Successfully");
                            } else {
                                System.out.println("Duplicate student ID");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Marks must be a number");

                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
                        }

                        break;

                    case 2:
                        // Deleting or Removing the Student Data Based on Student ID
                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                            if (studentService.deleteStudent(id)) {
                                System.out.println("Successfully removed student");
                            } else {
                                System.out.println("Student ID not found");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a number");
                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        // Updating Student Name based on Student ID
                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Name:");
                            name = sc.nextLine();

                            if (studentService.updateStudentName(id, name)) {
                                System.out.println("Name Has Been Updated..");
                            } else {
                                System.out.println("Student ID not found");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a number");

                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
                        }

                        break;
                    case 4:
                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a number");
                            break;
                        }

                        // Updating Student Marks Based on Student ID
                        try {
                            System.out.print("Enter Marks:");
                            marks = Integer.parseInt(sc.nextLine());

                            if (studentService.updateStudentMarks(id, marks)) {
                                System.out.println("Marks Has Been Updated..");
                            } else {
                                System.out.println("Student ID not found");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Marks must be a number");

                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
                        }

                        break;

                    case 5:
                        // Fetching Student Details Based on Particular ID

                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                            Student s = studentService.getStudent(id);
                            System.out.println(s);

                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a Number");

                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
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
                        try {
                            System.out.print("Enter Student ID:");
                            id = Integer.parseInt(sc.nextLine());

                            if (studentService.studentExists(id)) {
                                System.out.println("Student Exists..");
                            } else {
                                System.out.println("Student Does Not Exists..");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a Number");

                        } catch (InvalidStudentDataException e) {
                            System.out.println("Validation Error: " + e.getMessage());
                        }

                        break;

                    case 8:
                        // Exiting Application
                        System.out.println("Exiting Application...");
                        
                        return;

                    default:
                        // Invalid Choice Entered
                        System.out.println("Invalid Choice! Try Again!!");

                }

            }
        }

    }
}
