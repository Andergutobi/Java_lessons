package com.patxa.models;

public class Arbol implements Comparable<Arbol> {

    private String nombre;
    private String origen;

    ///////////////////////////////////////


    public Arbol(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    //////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }

    @Override
    public int compareTo(Arbol o) {
        //LA CLAVE DE ESTE MÉTODO ES DEVOLVER 0 EN EL CASO DE IGUALDAD
        //1 (O MAYOR QUE 1) EN EL CASO DE "SUPERIORIDAD" Ó -1 (O MENOR QUE -1) EN CASO DE INFERIORIDAD

        //ORDENAMIENTO "A LA CARTA"
        //Establecer un criterio de comparación en relación al número de letras
        //que tenga el nombre del árbol
        if (this.nombre.length() > o.nombre.length()) {
            return 1;
        } else if (this.nombre.length() < o.nombre.length()) {
            return -1;
        } else {
            return 0;
        }

    }
}
