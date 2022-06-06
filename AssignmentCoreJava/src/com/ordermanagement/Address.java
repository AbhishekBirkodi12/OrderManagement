package com.ordermanagement;

public class Address {
     private String pin;
     private String city;
     private String country;

    public Address(String pin, String city, String country) {
        this.pin = pin;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
