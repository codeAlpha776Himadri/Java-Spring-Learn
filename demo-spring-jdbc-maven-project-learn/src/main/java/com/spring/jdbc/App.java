package com.spring.jdbc;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
// import com.spring.jdbc.dao.StudentDaoImplementation;
import com.spring.jdbc.entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext daoContext = new AnnotationConfigApplicationContext("com/spring/jdbc/dao/");
        try {
            // Student student = ctx.getBean("mystudent", Student.class);
            // System.out.println(student);

            /*
             * // db operations
             * 
             * // Not Recommended way of performing db operations in a real java projects
             * 
             * JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
             * String query = "insert into student(id,name,city) values(?,?,?);" ;
             * System.out.println(jdbcTemplate.update(query,113,"Gourav","Khoyarpur")) ;
             * 
             */

            // correct industry way

            // get the dao bean

            StudentDao studentDao = daoContext.getBean("studentDao", StudentDao.class);

            // insert student to db

            // int isInserted = studentDao.insert(new Student(100, "Himadri", "kolkata")) ;
            // studentDao.insert(new Student(101, "Himadri", "Agartala")) ;
            // studentDao.insert(new Student(102, "Sneha", "Mumbai")) ;
            // studentDao.insert(new Student(103, "Krish", "Aamtali")) ;
            // studentDao.insert(new Student(104, "Pritam", "Bangkok")) ;
            // System.out.println("Inserted: "+isInserted);

            // update student using id

            // int isUpdated = studentDao.update(new Student(111,"Himadri","Gurugram")) ;
            // System.out.println("Updated: "+isUpdated);

            // delete student using id

            // int isDeleted = studentDao.delete(113) ;
            // System.out.println("Deleted: "+isDeleted);

            // selecting single student by id

            // Student student = studentDao.getStudentById(111) ;
            // System.out.println(student);

            // getting all students / records in the database

            // List<Student> students = studentDao.getAllStudents();
            // students.stream().forEach(System.out::println);

            // selecting student by name

            List<Student> students = studentDao.getStudentsByName("Himadri") ;
            students.stream().forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ((AnnotationConfigApplicationContext) daoContext).close();
        }
    }
}
