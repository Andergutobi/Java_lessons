package com.patxa.clase_abstracta;

public abstract class Humanoide {

    private String nombre;
    private int fuerza;
    private int inteligencia;

    //////////////////////////////

    public Humanoide(String nombre, int fuerza, int inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    public Humanoide() {
    }
    ///////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    //////////////////////////////////////////////


    public abstract String correr();

    public abstract String luchar();

    /*public String cabalgar(Caballo elCaballo){

        return "Humanoide cabalgando a "+ elCaballo.getNombre();

    }*/

    public abstract String cabalgar(Caballo elCaballo);


    //////////////////////////////////////////////


    @Override
    public String toString() {
        return "Humanoide{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                '}';
    }


}
