package com.Autowiring.XML;

public class ClassA {
    private int a ; 
    private ClassB objOfClassB ;
    
    public ClassA(int a, ClassB objOfClassB) {
        super() ; 
        this.a = a;
        this.objOfClassB = objOfClassB;
    }

    public ClassA() {
        super() ;
    }

    @Override
    public String toString() {
        return "ClassA [a=" + a + ", obj=" + objOfClassB + "]";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public ClassB getObjOfClassB() {
        return objOfClassB;
    }

    public void setObjOfClassB(ClassB objOfClassB) {
        this.objOfClassB = objOfClassB;
    }

    

    
    
}
