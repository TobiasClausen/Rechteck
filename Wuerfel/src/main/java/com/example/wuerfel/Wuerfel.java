package com.example.wuerfel;

public class Wuerfel {

    int aktuellerWurf;
    private int letzerWurf;

    public int werfen() {
        letzerWurf = aktuellerWurf;
        aktuellerWurf = (int)((Math.random()) * 6 + 1);
        return  aktuellerWurf;
    }

    public int getLetzerWurf() {
        return letzerWurf;
    }
}
