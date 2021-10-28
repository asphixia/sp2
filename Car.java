package com.company;

public abstract class Car {
    int regNr;
    String brand;
    String model;
    String year;
    int doorCount;

    public static void main (string[]args){
        gasCar bil1 = new gasCar();
        dieselCar bil2 = new dieselCar();
        electricCar bil3 = new electricCar();

    }

    public abstract void car();



    public void beregnGrønEjerafgift(){


    }



}
