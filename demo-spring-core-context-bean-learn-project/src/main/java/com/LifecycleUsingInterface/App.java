package com.LifecycleUsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("demoLifecycleUsingInterfaceConfig.xml");
        try {
            // demoLifecycle objLifecycleUsingInterface = (demoLifecycle) ctx.getBean("LifecycleUsingInterfaceBean");
            // System.out.println(objLifecycleUsingInterface);

            demoLifecycleUsingAnnotation objLifecycleUsingAnnotation = 
                (demoLifecycleUsingAnnotation) ctx.getBean("LifecycleUsingAnnotationBean") ;
            System.out.println(objLifecycleUsingAnnotation);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }
    }
}
