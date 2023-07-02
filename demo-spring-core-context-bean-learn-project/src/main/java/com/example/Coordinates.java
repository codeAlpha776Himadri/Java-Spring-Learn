package com.example;

public class Coordinates {
    private String latitude ; 
    private String longitude ;
    
    public Coordinates(String latitude, String longitude) {
        System.out.println("INJECTING USING CONSTRUCTOR | COORDINATES");
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setlatitude(String latitude) {
        System.out.println("INJECTING USING SETTER | COORDINATES");
        this.latitude = latitude;
    }
    public void setlongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
    }
    
}
