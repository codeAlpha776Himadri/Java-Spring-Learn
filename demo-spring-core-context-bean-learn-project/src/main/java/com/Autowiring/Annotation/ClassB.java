package com.Autowiring.Annotation;

public class ClassB {
    private int b;

    public ClassB(int b) {
        super();
        this.b = b;
    }

    public ClassB() {
        super();
    }

    @Override
    public String toString() {
        return "ClassB [b=" + b + "]";
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
