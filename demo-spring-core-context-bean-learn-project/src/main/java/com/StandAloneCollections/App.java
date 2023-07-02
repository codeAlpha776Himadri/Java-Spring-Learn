package com.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("standAloneCollectionsConfig.xml") ;
        try  {
            Employee employee1 = (Employee) ctx.getBean("bean1") ;
            Employee employee2 = (Employee) ctx.getBean("bean2") ;
            System.out.println(employee1+"\n\n"+employee2);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }
    }
}
