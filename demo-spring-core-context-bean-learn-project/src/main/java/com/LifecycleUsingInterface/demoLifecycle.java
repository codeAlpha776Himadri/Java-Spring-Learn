package com.LifecycleUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class demoLifecycle 
implements InitializingBean , DisposableBean{
    private int a;
    private int b;

    public demoLifecycle(int a, int b) {
        super();
        System.out.println("Setting property using constructor");
        this.a = a;
        this.b = b;
    }

    public demoLifecycle() {
        super();
    }

    @Override
    public String toString() {
        return "demoLifecycle [a=" + a + ", b=" + b + "]";
    }

    // initialization method provided by interface InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {

        /*
         * we generally place all initialization code here
         * ex: db connection , web connection etc
         */

        System.out.println("Inside init method");
    }

    // destroy method provided by interface DisposableBean
    @Override
    public void destroy() throws Exception {

        /*
         * we generally place all cleaning code here
         * ex: db disconnection , web disconnection etc
         */

        System.out.println("Inside destroy method");
    }

}

