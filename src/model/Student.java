package model;

public class Student {
    private final int id;
    private String name;
    private int marks;

    // Constructor
    public Student(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must be valid");
        }
        this.name = name;

    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be in Valid Range");

        }
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + "Name: " + name + " | " + "Marks: " + marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

}
