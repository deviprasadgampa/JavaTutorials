package com.neonq.tutoring.java.Class4;

public class GarageInfo {

    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.gears = 4;
        firstCar.carType = "SUV";
        firstCar.autoTransmission= true;
        firstCar.color="Green";
        firstCar.fuelType="Diesel";
        firstCar.mileage = 24;
        firstCar.model = "Mahindra 300";


        Car secondCar = new Car();
        secondCar.gears = 4;
        secondCar.carType = "HatchBack";
        secondCar.autoTransmission= true;
        secondCar.color="Green";
        secondCar.fuelType="Diesel";
        secondCar.mileage = 24;
        secondCar.model = "Benz 300";

        Car[] ajayCars = new Car[2];
        ajayCars[0] = firstCar;
        ajayCars[1] = secondCar;

        User abc = new User("Ajay", ajayCars,2022,8,12);

        System.out.println(abc.name);
        System.out.println(abc.hisCars[0].model+ " "+ abc.hisCars[1].model);

    }
}
