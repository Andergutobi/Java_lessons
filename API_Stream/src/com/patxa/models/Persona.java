package com.patxa.models;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private List<Viaje> listaViajes = new ArrayList<>();

    ////////////////////////////////////////////////


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Viaje> getListaViajes() {
        return listaViajes;
    }

    public void setListaViajes(List<Viaje> listaViajes) {
        this.listaViajes = listaViajes;
    }

    ///////////////////////////////////////////////////

    public void addViaje(Viaje v) {

        this.listaViajes.add(v);

    }
}
