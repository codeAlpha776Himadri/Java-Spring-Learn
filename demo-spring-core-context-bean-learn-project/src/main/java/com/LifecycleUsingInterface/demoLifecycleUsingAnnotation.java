package com.LifecycleUsingInterface;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class demoLifecycleUsingAnnotation {
    private int a;
    private int b;

    public demoLifecycleUsingAnnotation(int a, int b) {
        super();
        System.out.println("Setting property using constructor");
        this.a = a;
        this.b = b;
    }

    public demoLifecycleUsingAnnotation() {
        super();
    }

    // initialization method specified by PostConstruct annotation
    @PostConstruct
    public void init() {

        /*
         * we generally place all initialization code here
         * ex: db connection , web connection etc
         */

        System.out.println("Inside init method");
    }

    // destroy method specified by PreDestroy annotation
    @PreDestroy
    public void destroy() {

        /*
         * we generally place all cleaning code here
         * ex: db disconnection , web disconnection etc
         */

        System.out.println("Inside destroy method");
    }

    @Override
    public String toString() {
        return "demoLifecycleUsingAnnotation [a=" + a + ", b=" + b + "]";
    }
}
