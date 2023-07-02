package com.Autowiring.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiringConfig.xml") ;
        try {
            ClassB objClassB = (ClassB) ctx.getBean("objOfClassB") ;
            System.out.println(objClassB);

            ClassA objClassA = (ClassA) ctx.getBean("beanOfClassA") ;
            System.out.println(objClassA);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }

    }
}
