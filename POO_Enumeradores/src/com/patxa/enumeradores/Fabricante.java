package com.patxa.enumeradores;

public enum Fabricante {

    FERRARI("Ferrari", "Italia"),
    SEAT("SEAT", "España"),
    RENAULT("Renault", "Francia");

    /////////////////////////////////////////////
    private String nombre;
    private String pais;
    //////////////////////////////////////////////

    Fabricante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    //////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }


}
