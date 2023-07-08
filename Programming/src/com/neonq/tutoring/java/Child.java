package com.neonq.tutoring.java;

public class Child extends  Parent implements Parent2, ExampleAbstract{

//    public int getNumber() {
//
//        int pr = this.getPrivate();
//        return this.protectedVariable;
//    }


    @Override
    public String getParentName() {
        return "String";
    }

    @Override
    public String getCountryName() {
        return "India";
    }
}
