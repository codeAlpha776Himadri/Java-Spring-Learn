package com.spEl;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("DemoObj")
@Scope("singleton") // default
public class Demo {

    public static String staticVar = "i am static var";

    @Value("#{T(com.spEl.Demo).staticMethod() <= 50 ? T(com.spEl.Demo).staticVar : 200}")
    private String a;

    @Autowired
    private DemoRef demoRef;

    public Demo(String a, DemoRef demoRef) {
        this.a = a;
        this.demoRef = demoRef;
    }

    public Demo() {
        super();
    }

    public static int staticMethod() {
        return (new Random()).nextInt(100) + 1;
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Demo [a=" + a + ", demoRef=" + demoRef + "]";
    }

}
