package com.example.reisezummond;

public class Mondreise {


    double distanze= 383400;

    double result;
    private double speedKmh;

    public Mondreise(double speedKmh) {
        this.speedKmh = speedKmh;
    }


    public double getTravelDurationDays(){

        return this.getTravelDurationHours()/24;
    }

    public double getTravelDurationHours(){
        return distanze/speedKmh;
    }



}
