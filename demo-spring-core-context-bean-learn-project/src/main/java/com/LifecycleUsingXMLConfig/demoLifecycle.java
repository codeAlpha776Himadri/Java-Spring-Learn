package com.LifecycleUsingXMLConfig;

public class demoLifecycle {
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

    public void initialization() {

        /*
         * we generally place all initialization code here
         * ex: db connection , web connection etc
         */

        System.out.println("Inside init method");
    }

    public void destroy() {

        /*
         * we generally place all cleaning code here
         * ex: db disconnection , web disconnection etc
         */

        System.out.println("Inside destroy method");
    }

}
