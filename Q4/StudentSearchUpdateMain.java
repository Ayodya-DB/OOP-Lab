
package com.mycompany.labsheet8;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.findStudentById(1);
        studentDAO.updateStudentMark(1, 95);
        studentDAO.findStudentById(1);
    }
}