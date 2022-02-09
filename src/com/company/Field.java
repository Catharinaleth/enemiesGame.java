package com.company;

public class Field {
    private boolean ledig;
    String symbol = "_";
    int x; //x koordinat
    int y; //y koordinat

    public Field() {
        ledig = true;
    }
    public boolean erLedig() {
        return ledig;
    }

    public void setOptaget() { //evt. ændre navn herpå
        this.ledig = false;
    }
}
