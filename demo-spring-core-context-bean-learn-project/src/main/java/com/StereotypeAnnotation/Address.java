package com.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressObject")
public class Address {
    @Value("Sardar lane")
    private String lane;

    @Value("Hampton")
    private String city;

    @Value("California")
    private String state;

    public Address(String lane, String city, String state) {
        super();
        this.lane = lane;
        this.city = city;
        this.state = state;
    }

    public Address() {
        super();
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [lane=" + lane + ", city=" + city + ", state=" + state + "]";
    }
}
