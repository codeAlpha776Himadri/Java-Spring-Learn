package com.Autowiring.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private int a;

    // @Autowired //--> Here also it can be used (Property injection)
    private ClassB objClassB;

    // @Autowired // for constructor injection
    // @Qualifier("beanOfClassB2") // this doesnt works with constructor injection 
    public ClassA(int a, ClassB objClassB) {
        super();
        this.a = a;
        this.objClassB = objClassB;
    }

    public ClassA() {
        super();
    }

    @Override
    public String toString() {
        return "ClassA [a=" + a + ", obj=" + objClassB + "]";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public ClassB getobjClassB() {
        return objClassB;
    }

    @Autowired //--> Here also it can be used (Property injection)
    @Qualifier("beanOfClassB2") // injects bean with name given in the qualifier
    public void setobjClassB(ClassB objClassB) {
        this.objClassB = objClassB;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing..");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying..");
    }

}
