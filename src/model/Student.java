package model;

public class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks){
      this.id = id;
      this.name = name;
      this.marks = marks;
    }

    public void display(){
        System.out.println(id + " | " + name + " | " + marks);
    }
    
}
