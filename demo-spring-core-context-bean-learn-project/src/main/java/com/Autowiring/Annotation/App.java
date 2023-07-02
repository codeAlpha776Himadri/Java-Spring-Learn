package com.Autowiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiringConfig.xml");
        try {
            ClassA objClassA = (ClassA) ctx.getBean("beanClassA");
            System.out.println(objClassA);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }
    }
}
