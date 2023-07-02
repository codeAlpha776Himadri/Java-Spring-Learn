package com.spring.orm.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.hibernate.dao.StudentDao;
import com.spring.orm.hibernate.entities.Student;

public class App {
    public static void main(String[] args) {

        // Class Configuration
        ApplicationContext daoContext = new AnnotationConfigApplicationContext("com/spring/orm/hibernate/dao/");

        // XML Configuration
        ApplicationContext daoContextXML = new ClassPathXmlApplicationContext("daoConfig.xml");

        try {

            StudentDao studentDao = daoContextXML.getBean("studentDao", StudentDao.class);

            // System.out.println("Inserted: "+studentDao.insertStudent(new Student(201,"rupam","sonamura")));

            // Student student1 = studentDao.getStudentById(100) ;
            // System.out.println(student1);

            // get all students
            studentDao.getAllStudents().stream().forEach(System.out::println);

            // delete studennt by id 
            // studentDao.deleteStudentById(100);

            // update student
            // Student student2 = new Student(100,"sonam kapur","streets");
            // studentDao.updateStudent(student2);

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            ((AnnotationConfigApplicationContext) daoContext).close();
            ((ClassPathXmlApplicationContext) daoContextXML).close();

        }

    }
}
