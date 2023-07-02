package com.spEl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoRef")
@Qualifier("prototype")
public class DemoRef {
    @Value("112233")
    private int b ;

    @Override
    public String toString() {
        return "DemoRef [b=" + b + "]";
    }

}
