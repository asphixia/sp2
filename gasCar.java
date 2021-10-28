package com.company;

public class gasCar extends Car {
    int octane;
    int kmPrl;
    int afgift1;
    int udligningsAfgift;
    boolean partikelFilter = false;
    int partikeludledningsafgift;

    @Override

    public void car(){
        Bil gasCar = new Bil();
        gasCar.setRegNr("ce10339");
        gasCar.setBrand=("Ford");
        gasCar.setModel("Fiesta");
        gasCar.setYear("2018");
        gasCar.setDoorCount(5);
        gasCar.printDetails();

    }


    public void calculateGreen(){
        kmPrl = 100/(whPrKm/91.25);
        if(kmPrl < 50 && kmPrl > 20){
            afgift=330;

        }
        else if(kmPrl > 15 && kmPrl < 20){
            afgift=1050;


        }
        else if(kmPrl < 10 && kmPrl > 15){
            afgift=2340;


        }
        else if(kmPrl < 10 && kmPrl > 5){
            afgift=5500;

        }
        else if(kmPrl < 5){
            afgift=10470;

        }


    }

}
