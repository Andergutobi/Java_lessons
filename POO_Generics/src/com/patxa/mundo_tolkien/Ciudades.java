package com.patxa.mundo_tolkien;

public enum Ciudades {

    MORDOR("Mordor", 32000),
    LACOMARCA("La Comarca", 1000),
    RIVENDEL("Rivendel", 1500),
    GONDOR("Gondor", 5000);

    ////////////////////////////////
    private String nombre;
    private int nHabitantes;
    ///////////////////////////////


    Ciudades(String nombre, int nHabitantes) {
        this.nombre = nombre;
        this.nHabitantes = nHabitantes;
    }

    ////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }
}
