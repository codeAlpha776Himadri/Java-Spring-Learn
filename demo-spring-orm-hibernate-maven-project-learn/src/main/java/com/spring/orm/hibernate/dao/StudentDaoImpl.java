package com.spring.orm.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.hibernate.entities.Student;

public class StudentDaoImpl implements StudentDao, Serializable {

    private HibernateTemplate hibernateTemplate;

    public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
        super();
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDaoImpl() {
        super() ;
    }

    @Override
    @Transactional
    public int insertStudent(Student student) {
        return (Integer) this.hibernateTemplate.save(student);
    }

    @Override
    @Transactional
    public Student getStudentById(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Override
    @Transactional
    public void deleteStudentById(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(student);
        return;
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }

    @Override
    public String toString() {
        return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
