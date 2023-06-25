package com.neonq.tutoring.java;

public class InitializerClass {

    public static void main(String[] args) {


        DependentClass depClass = new DependentClass();

        System.out.println(depClass.zipCode);
        System.out.println(depClass.name);

        String returnedStr =  depClass.sendInvite(depClass.name);
        System.out.println( returnedStr );


        DependentClass depClass_Prasad = new DependentClass(505, "Prasad");

        System.out.println(depClass_Prasad.zipCode);
        System.out.println(depClass_Prasad.name);

        System.out.println(depClass_Prasad.getName());

    }


}
