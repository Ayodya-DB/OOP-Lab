package com.mycompany.labsheet8;

public class StudentInsertMain {
    public static void main(String[] args) {
        Student newStudent = new Student(1, "Nimal Perera", 82);
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.addStudent(newStudent);
    }
}