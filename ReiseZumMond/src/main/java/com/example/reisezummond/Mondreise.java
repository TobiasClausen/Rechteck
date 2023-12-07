package com.example.reisezummond;

public class Mondreise {


    double distanze= 383400;

    double result;
    private double speedKmh;

    // Konstruktor, der den Wert bei der Instanziierung annimmt
    public Mondreise(double speedKmh) {
        this.speedKmh = speedKmh;
    }


    public double getTravelDurationDays(){
        result = distanze/speedKmh/24;
        return result;
    }

    public double getTravelDurationHours(){
        result = distanze/speedKmh;
        return result;
    }



}
