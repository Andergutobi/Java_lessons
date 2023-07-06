package com.patxa.mundo_tolkien;

public enum Profesion {

    HERRERO("Herrero"),
    GRANJERO("Granjero"),
    COMERCIANTE("Comerciante"),
    MAGO("Mago"),
    CAPITANBARCO("Capitán de Barco");

    //////////////////////////////
    private String profesion;
    /////////////////////////////

    Profesion(String profesion) {
        this.profesion = profesion;
    }

    ///////////////////////////////

    public String getProfesion() {
        return profesion;
    }

    ///////////////////////////////


    @Override
    public String toString() {
        return "Profesion{" +
                "profesion='" + profesion + '\'' +
                "} " + super.toString();
    }
}
