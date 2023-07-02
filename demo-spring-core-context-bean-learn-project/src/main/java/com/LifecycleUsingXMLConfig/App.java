package com.LifecycleUsingXMLConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("demoLifecycleUsingXMLConfig.xml") ;
        try {
            // demoLifecycle obj1 = (demoLifecycle)ctx.getBean("demoBean") ;
            // System.out.println(obj1);

            // obj2 is bean with lifecyccle method defined
            demoLifecycle obj2 = (demoLifecycle)ctx.getBean("demoBeanWithLifecycleMethods") ;
            System.out.println(obj2);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }

    }
}
