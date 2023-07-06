package com.patxa.mundo_tolkien;

public enum Calidad {

    EXCELENTE("Excelente"),
    BUENA("Buena"),
    MALA("Mala"),
    PESIMA("Pésima");

    /////////////////////////////////////////
    private String calidad;
    ////////////////////////////////////////


    Calidad(String calidad) {
        this.calidad = calidad;
    }

    ///////////////////////////////////////


    public String getCalidad() {
        return calidad;
    }

    /////////////////////////////////////


    @Override
    public String toString() {
        return "Calidad{" +
                "calidad='" + calidad + '\'' +
                "} " + super.toString();
    }


}
