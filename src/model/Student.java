package model;

public class Student {
    private int id;
    private String name;
    private int marks;

    @Override
    public String toString(){
        return "ID: "+ id +" | "+"Name: "+ name +" | "+"Marks: "+ marks;
    }
    
    // Constructor 
    public Student(int id, String name, int marks){
      this.id = id;
      this.name = name;
      this.marks = marks;
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks");
            return;
        }
        this.marks = marks;
    }
    public void setId(int id){
        if(id <= 0){
            System.out.println("Invalid id");
            return; 
        }
        this.id = id;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }


    
}
