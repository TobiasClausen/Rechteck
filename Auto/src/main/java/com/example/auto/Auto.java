package com.example.auto;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Auto {

    private int AktualleGeschwindigkeit=0;
    private int AktuellerGang=1;
    private boolean istMotorGestartet=false;
    private String marke;
    private int ps;
    private double tankFuelstand=0.0;


    public int getAktualleGeschwindigkeit() {
        return AktualleGeschwindigkeit;
    }

    public int getAktuellerGang() {
        return AktuellerGang;
    }

    public boolean isIstMotorGestartet() {
        return istMotorGestartet;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }


    public int getPs() {
        switch (marke){
            case "Opel":
                ps = 90;
                break;
            case "Porsche":
                ps = 250;
                break;
            case "Ferrari":
                ps = 370;
                break;
            default:
                ps=0;
                break;
        }
        return ps;
    }

    public double getTankFuelstand() {
        return tankFuelstand;
    }

    public void auftanken(){
        if (!istMotorGestartet){
            tankFuelstand=1.0;
            AktualleGeschwindigkeit=0;
            AktuellerGang=1;
        }



    }
    public void bremsen(){
        if (AktualleGeschwindigkeit>=10) {
            AktualleGeschwindigkeit = AktualleGeschwindigkeit - 10;
            Gear();
        }
    }
    public void gibGas(){
        if (istMotorGestartet&&tankFuelstand>0&&AktualleGeschwindigkeit<ps){
            AktualleGeschwindigkeit=AktualleGeschwindigkeit+ps/10;
            Gear();
        }else if(AktualleGeschwindigkeit>ps){
            AktualleGeschwindigkeit=ps;
        }
        Verbrauch();


    }
    public void hube(){

        String soundFilePath = "/Users/tobiasclausen/Documents/ICT_Berufsbildung/Java/OO/Projects/Projects/Auto/Audio/AutoHupen.wav";
        SoundPlayer.playSound(soundFilePath);

    }
    public void schalteMotorAus(){
        istMotorGestartet=false;

    }
    public void starteMotor(){
        istMotorGestartet=true;



    }
    public String toString(){
        return null;
    }
    private void Gear(){
        if (AktualleGeschwindigkeit<=10){
            AktuellerGang=1;
        }else if (AktualleGeschwindigkeit<=20){
            AktuellerGang=2;
        }else if (AktualleGeschwindigkeit<=40){
            AktuellerGang=3;
        }else if (AktualleGeschwindigkeit<=70){
            AktuellerGang=4;
        }else if (AktualleGeschwindigkeit<=100){
            AktuellerGang=5;
        }else if (AktualleGeschwindigkeit>100){
            AktuellerGang=6;
        }
    }
    private void Verbrauch(){
        if (istMotorGestartet) {
            tankFuelstand = tankFuelstand - (Double.valueOf(ps) / 10000.0);
            if (tankFuelstand <= 0 && istMotorGestartet) {
                schalteMotorAus();
                AktualleGeschwindigkeit=0;
                AktuellerGang=1;
            }
        }
    }

}
