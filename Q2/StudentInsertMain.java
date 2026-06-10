/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet8;

/**
 *
 * @author sahan
 */
public class StudentInsertMain {
    public static void main(String[] args) {
        Student newStudent = new Student(1, "Nimal Perera", 82);
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.addStudent(newStudent);
    }
}