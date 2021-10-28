package com.company;

public class electricCar extends Car{
    int batteryCapacityKWh;
    int kmPrl;
    int whPrKm;
    int afgift3;


    @Override


    public void car(){
        Bil electricCar = new Bil();

    }
    public void setDetails(){
        electricCar.setRegNr("fed4832");
        electricCar.setBrand=("Tesla");
        electricCar.setModel("Model X");
        electricCar.setYear("2015");
        electricCar.setDoorCount(5);
        electricCar.setDetails();


    }
    public void getDetails(){
        return gasCar.getDetails();

    }

    public void calculateGreen(){
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
