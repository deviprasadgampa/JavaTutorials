package com.neonq.tutoring.java.Class4;

public class User {

    String name;

    Car[] hisCars;

    int yearOfCarBought;

    int monthOfCarBought;

    int lastServicedMonth;

    public User(String name, Car[] hisCars, int yearOfCarBought, int monthOfCarBought, int lastServicedMonth) {
        this.name = name;
        this.hisCars = hisCars;
        this.yearOfCarBought = yearOfCarBought;
        this.monthOfCarBought = monthOfCarBought;
        this.lastServicedMonth = lastServicedMonth;
    }
}
