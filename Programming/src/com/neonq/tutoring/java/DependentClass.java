package com.neonq.tutoring.java;

public class DependentClass {


    // Constructor Overloading
    DependentClass() {
        this.zipCode = 0;
        this.name = null;
    }

    DependentClass(int z, String n) {
        this.zipCode = z;
        this.name = n;
    }

    int zipCode;
    String name;

    public String getName() {
        return this.name;
    }


}
