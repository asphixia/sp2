package com.company;

public class dieselCar extends Car{
    boolean hasPartikelFilter;
    int kmPrl;
    int afgift;

    String regNr;
    String brand;
    String model;
    String year;
    int doorCount;

    @Override



    public void car(){
        Bil dieselCar = new Bil();

    }

    public void setDetails(){
        dieselCar.setRegNr("de27988");
        dieselCar.setBrand=("PEUGEOT");
        dieselCar.setModel("e-208");
        dieselCar.setYear("2008");
        dieselCar.setDoorCount(5);
        dieselCar.printDetails();


    }
    public void getDetails(){
        return dieselCar.getDetails();

    }

    public void calculateGreen(){
        if(kmPrl < 50 && kmPrl > 20){
            afgift1=330;
            udligningsAfgift=130;

        }
        else if(kmPrl > 15 && kmPrl < 20){
            afgift1=1050;
            udligningsAfgift=1390;


        }
        else if(kmPrl < 10 && kmPrl > 15){
            afgift1=2340;
            udligningsAfgift=1850;


        }
        else if(kmPrl < 10 && kmPrl > 5){
            afgift1=5500;
            udligningsAfgift=2770;

        }
        else if(kmPrl < 5){
            afgift1=10470;
            udligningsAfgift=15260;


        }
        if(partikelFilter==false){
            partikeludledningsafgift=1000;
        }
    }
}
