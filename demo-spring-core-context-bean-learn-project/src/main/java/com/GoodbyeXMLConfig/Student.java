package com.GoodbyeXMLConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
// import org.springframework.stereotype.Component;

// @Component("studentObject") // alredy defined hai in Config.java
@Scope("prototype")
public class Student {

    private String studentName;

    private String studentId;

    private Address studentAddress ;

    public Student(String studentName, String studentId, Address studentAddress) {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress=studentAddress;
    }

    public Student() {
        super();
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAddress=" + studentAddress + "]";
    }

}
