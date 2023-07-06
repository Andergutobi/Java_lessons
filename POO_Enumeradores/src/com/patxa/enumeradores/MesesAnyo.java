package com.patxa.enumeradores;

public enum MesesAnyo {

    ENERO(31, "January", "Enero"),
    FEBRERO(28, "February", "Febrero"),
    MARZO(31, "March", "Marzo"),
    ABRIL(30, "April", "Abril"),
    MAYO(31, "May", "Mayo"),
    JUNIO(30, "June", "Junio"),
    JULIO(31, "July", "Julio"),
    AGOSTO(31, "August", "Agosto"),
    SEPTIEMBRE(30, "September", "Septiembre"),
    OCTUBRE(31, "October", "Octubre"),
    NOVIEMBRE(30, "November", "Noviembre"),
    DICIEMBRE(31, "December", "Diciembre");

    /////////////////////////////////////////////
    private int nDias;
    private String nombreIngles;
    private String nombreCastellano;
    ////////////////////////////////////////////


    MesesAnyo(int nDias, String nombreIngles, String nombreCastellano) {
        this.nDias = nDias;
        this.nombreIngles = nombreIngles;
        this.nombreCastellano = nombreCastellano;
    }

    /////////////////////////////////////////////////


    public int getnDias() {
        return nDias;
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public String getNombreCastellano() {
        return nombreCastellano;
    }
}
