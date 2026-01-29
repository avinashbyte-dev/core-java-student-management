package util;

import exceptions.InvalidStudentDataException;

public class StudentValidator {

    public static void validateId(int id) {
        if (id <= 0) {
            throw new InvalidStudentDataException("ID must be positive");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new InvalidStudentDataException("Name must not be empty");
        }
    }

    public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidStudentDataException("Marks must be between 0 and 100");
        }
    }
}
