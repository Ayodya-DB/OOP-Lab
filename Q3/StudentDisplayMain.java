package com.mycompany.labsheet8;

public class StudentDisplayMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        
        System.out.println("--- All Students ---");
        studentDAO.displayAllStudents();
    }
}