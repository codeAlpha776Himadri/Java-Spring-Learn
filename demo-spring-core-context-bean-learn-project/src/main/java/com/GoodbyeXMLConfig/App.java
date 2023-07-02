package com.GoodbyeXMLConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = 
            new AnnotationConfigApplicationContext(Config.class) ;
        try {
            Student student = context.getBean("studentBean",Student.class) ;
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ((AnnotationConfigApplicationContext) context).close();
        }
    }
}
