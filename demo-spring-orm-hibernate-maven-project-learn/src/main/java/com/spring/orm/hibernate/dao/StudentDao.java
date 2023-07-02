package com.spring.orm.hibernate.dao;

import java.util.List;

import com.spring.orm.hibernate.entities.Student;

public interface StudentDao {
    public int insertStudent(Student student) ;
    public Student getStudentById(int studentId) ;
    public List<Student> getAllStudents() ;
    public void deleteStudentById(int studentId) ;
    public void updateStudent(Student student) ;
}
