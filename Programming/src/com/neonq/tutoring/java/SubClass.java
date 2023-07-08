package com.neonq.tutoring.java;

public class SubClass extends SuperClass{

    // overrides printMethod in Superclass
    public void printMethod() {

        System.out.println("Printed in Subclass");
        super.printMethod();
    }


    public static void main(String[] args) {
        SuperClass s = new SubClass();

        s.printMethod();
        s.printString();
    }
}
