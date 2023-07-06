package com.joselu.set.treeset_clasespropias;

public class Orco {

    //La clase Orco no va a implementar la interface Comparable, pero el método compareTo
    //lo vamos a establecer "directamente" en el constructor del TreeSet

    private String nombre;

    //////////////////////////////////////////


    public Orco(String nombre) {
        this.nombre = nombre;
    }

    //////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    ////////////////////////////////////////


    @Override
    public String toString() {
        return "Orco{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
