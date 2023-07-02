package com.spring.orm.hibernate.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Access(value=AccessType.FIELD)
public class Student {

    // @GeneratedValue()
    @Id
    @Column(name = "id")
    private Integer studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "city")
    private String studentCity;

    public Student(Integer studentId, String studentName, String studentCity) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
                + "]";
    }

}
