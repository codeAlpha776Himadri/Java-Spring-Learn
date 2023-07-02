package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentConfig.xml", "addressConfig.xml");
        try {
            Student student1 = (Student) context.getBean("Student1");
            Student student2 = (Student) context.getBean("Student2");
            Student student3 = (Student) context.getBean("Student3");
            System.out.println("\n" + student1);
            System.out.println("\n" + student2);
            System.out.println("\n" + student3);
        } finally {
            ((ClassPathXmlApplicationContext) context).close();
        }

    }
}
