package com.joselu.set.treeset_clasespropias;

public class Elfo implements Comparable<Elfo> {

    private String nombre;
    private int edad;

    ///////////////////////////////////////


    public Elfo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    ///////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Elfo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


    @Override
    public int compareTo(Elfo otroElfo) {
        //Aquí me compararo "yo" (this) con otroElfo
        return otroElfo.edad - this.edad;
    }


    ////////////////////////////////////////
}
