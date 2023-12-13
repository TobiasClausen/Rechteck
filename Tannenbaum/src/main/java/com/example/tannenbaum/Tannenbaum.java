package com.example.tannenbaum;

public class Tannenbaum {

    private String Zeichnung;
    public String getZeichnung() {
        return Zeichnung;
    }
    private int stammbreite;
    public void setStammbreite(int stammbreite) {
        this.stammbreite = stammbreite;
    }

    private int stammhoehe;
    public void setStammhoehe(int stammhoehe) {
        this.stammhoehe = stammhoehe;
    }

    private int kronenhoehe;
    public void setKronenhoehe(int kronenhoehe) {
        this.kronenhoehe = kronenhoehe;
    }

    public String zeichnen(){
        String stern = "*";
        String tap = " ";
        int blatt = 1;
        int breite_baum;
        int taps;
        StringBuilder result = new StringBuilder();

        breite_baum = (kronenhoehe) * 2 - 1;
        taps = breite_baum / 2;

        for (int i = 1; i <= kronenhoehe; i++){
            for (int j = taps; j >= 1; j--) {
                result.append(tap+" ");
            }
            taps--;
            for (int j = 1; j <= blatt; j++){
                result.append(stern);
            }
            blatt += 2;
            result.append("\n");
        }
        for (int i = stammhoehe; i >= 1; i--){
            for (int j = (breite_baum / 2) - (stammbreite / 2); j >= 1; j--){
                result.append(tap+tap);
            }
            for (int j = stammbreite; j >= 1; j--){
                result.append(stern);
            }
            result.append("\n");
        }
        return result.toString();
    }

}
