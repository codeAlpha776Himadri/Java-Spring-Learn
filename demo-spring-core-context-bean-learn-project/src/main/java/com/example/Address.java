package com.example;

public class Address {
    private int houseNumber ; 
    private String street ; 
    private String city ; 
    private String state ;
    private Coordinates coordinates ; 
    
    public Address(int houseNumber, String street, String city, String state, Coordinates coordinates) {
        super() ; 
        System.out.println("INJECTING USING CONSTRUCTOR | ADDRESS");
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.coordinates=coordinates; 
    }

    public Address() {
        super() ;
    }

    public void setHouseNumber(int houseNumber) {
        System.out.println("INJECTING USING SETTER | ADDRESS");
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
                + ", coordinates=" + coordinates + "]";
    }

}
