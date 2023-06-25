package com.neonq.tutoring.java;

public class DependentClass {


    //Variables
    //Methods

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


    // Method Overloading

    public String sendInvite(String student) {
        return "Welcome to NeonQ, All the Best: "+student;
    }

    public String sendInvite(String firstName, String studentName) {
        return "Welcome to NeonQ, All the Best: "+firstName+ " "+ studentName;
    }

    public String sendInvite(int empID){
        return "Welcome to NeonQ, All the Best: "+empID;
    }


}
