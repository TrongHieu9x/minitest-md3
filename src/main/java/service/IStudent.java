package service;

import model.Student;

import java.sql.SQLException;

public interface IStudent {
    void insertStudent(Student student) throws SQLException;

    Student selectStudentName(String name) throws SQLException;

    boolean deleteStudentName(String name) throws SQLException;

    boolean updateStudentName(Student student) throws SQLException;

    void SelectStudentName(String name);

    boolean DeleteStudentName(String name) throws SQLException;

    boolean updateStudent(Student student) throws SQLException;

    void checkStudentLike(Student student);

    void checkStudent(Student student);
}
