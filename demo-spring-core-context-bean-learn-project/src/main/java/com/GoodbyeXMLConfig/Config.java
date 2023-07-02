package com.GoodbyeXMLConfig;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // defines this class as config class
// @ComponentScan(basePackages = "com.GoodbyeXMLConfig") // kyuki inside we used @Bean
public class Config {

    @Bean("address")
    public Address getAddress() {
        return new Address("Agartala","Tripura") ;
    }

    @Bean("studentBean")
    public Student getStudent() {
        return new Student("Himadri","1001",getAddress()) ;
    }

}
