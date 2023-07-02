package com.GoodbyeXMLConfig;

public class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        super() ;
        this.city = city;
        this.state = state;
    }

    public Address() {
        super() ;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
}
