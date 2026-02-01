# 🎓 Core Java Student Management System

A **console-based Core Java application** designed to demonstrate strong **Object-Oriented Programming (OOP)** principles, clean architecture, and robust **exception handling** using the Java Collections Framework.

This project is built as a **learning-focused, real-world style application** to strengthen Core Java fundamentals before moving into **Java Backend (Spring Boot)** and **Full-Stack Development**.

---

## 🚀 Features

* Add a student with **unique ID validation**
* Update student details (**name and marks**)
* Delete a student by ID
* View student details by ID
* View all stored students
* Check if a student exists by ID
* **Graceful handling of invalid inputs** (non-numeric, empty, out-of-range)
* Menu-driven console interface
* Clean separation between layers (UI, Service, Validation, Model)

---

## 🧠 Concepts & Skills Demonstrated

* Core Java fundamentals
* Classes & Objects
* Constructors and `final` keyword usage
* Encapsulation (private fields with getters/setters)
* Packages and modular project structure
* Java Collections (`HashMap`, `Collection`)
* Enhanced for-loops
* Method overriding (`toString`, `equals`, `hashCode`)
* Separation of Concerns (Model → Service → Utility → Main)
* Custom exception creation and handling
* Defensive programming and input validation

---

## 🏗 Project Structure

```
src/
├── main/
│   └── Main.java
├── model/
│   └── Student.java
├── service/
│   └── StudentService.java
├── util/
│   └── StudentValidator.java
└── exceptions/
    └── InvalidStudentDataException.java
```

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/avinashbyte-dev/core-java-student-management.git
   ```

2. Open the project in any Java IDE (IntelliJ IDEA / Eclipse / VS Code)

3. Compile and run `Main.java`

4. Use the menu options to add, view, update, and delete student records

---

## 📦 Validation & Exception Handling

* Validation logic is centralized in a **utility layer** (`StudentValidator`)
* Custom exception (`InvalidStudentDataException`) is used instead of generic exceptions
* Prevents application crashes due to invalid user input
* Ensures consistent and readable error messages
* Reflects **real-world Java backend design practices**

---

## 🎯 Learning Objective

This project was built to:

* Strengthen Core Java fundamentals
* Practice real-world OOP design
* Understand layered architecture
* Learn proper exception handling
* Prepare for Java Backend & Full-Stack development
* Build confidence before moving into DSA and system design

---

## 📌 Future Enhancements

* File-based or database persistence
* Unit testing using JUnit
* Refactoring into a Spring Boot REST API
* Improved menu-driven UI
* Advanced validations
* Sorting and searching features

---

## 👨‍💻 Author

**Arem Avinash Reddy**
Aspiring Java Full Stack Developer

🔗 LinkedIn: [https://www.linkedin.com/in/arem-avinash-reddy-377879346/](https://www.linkedin.com/in/arem-avinash-reddy-377879346/)

---

⭐ *This project represents a strong foundation in Core Java and backend-ready coding practices.*
