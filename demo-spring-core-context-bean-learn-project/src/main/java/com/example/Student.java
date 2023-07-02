package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private Address studentAddress;
    private List<String> studentSubjects;
    private Set<String> studentUniqueRegistrations;
    private Map<String, String> studentSubjectFaculty;
    private Properties studentProperties ;

    public Student(int studentId, String studentName, Address studentAddress, List<String> studentSubjects,
            Set<String> studentUniqueRegistrations, Map<String, String> studentSubjectFaculty, Properties studentProperties) {
        super();
        System.out.println("INJECTING USING CONSTRUCTOR | ADDRESS");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentSubjects = studentSubjects;
        this.studentUniqueRegistrations = studentUniqueRegistrations;
        this.studentSubjectFaculty = studentSubjectFaculty;
        this.studentProperties=studentProperties ;
    }

    public Student() {
        super();
    }

    public void setStudentId(int studentId) {
        System.out.println("INJECTING USING SETTER | STUDENT");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentSubjects(List<String> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public void setStudentUniqueRegistrations(Set<String> studentUniqueRegistrations) {
        this.studentUniqueRegistrations = studentUniqueRegistrations;
    }

    public void setStudentSubjectFaculty(Map<String, String> studentSubjectFaculty) {
        this.studentSubjectFaculty = studentSubjectFaculty;
    }

    public void setStudentProperties(Properties studentProperties) {
        this.studentProperties = studentProperties;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + ", studentSubjects=" + studentSubjects + ", studentUniqueRegistrations=" + studentUniqueRegistrations
                + ", studentSubjectFaculty=" + studentSubjectFaculty + ", studentProperties=" + studentProperties + "]";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public List<String> getStudentSubjects() {
        return studentSubjects;
    }

    public Set<String> getStudentUniqueRegistrations() {
        return studentUniqueRegistrations;
    }

    public Map<String, String> getStudentSubjectFaculty() {
        return studentSubjectFaculty;
    }

    public Properties getStudentProperties() {
        return studentProperties;
    }


}
