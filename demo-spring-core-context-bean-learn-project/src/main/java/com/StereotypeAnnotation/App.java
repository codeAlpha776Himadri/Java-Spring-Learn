package com.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeAnnotationConfig.xml");
        try {
            Employee employee1 = context.getBean("employeeObject", Employee.class);
            Employee employee2 = context.getBean("employeeObject", Employee.class);
            System.out.println(employee1.hashCode());
            System.out.println(employee2.hashCode());
        } finally {
            ((ClassPathXmlApplicationContext) context).close();
        }
    }
}
