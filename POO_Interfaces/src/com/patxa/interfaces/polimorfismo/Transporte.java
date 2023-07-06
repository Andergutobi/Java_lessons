package com.patxa.interfaces.polimorfismo;

import java.util.ArrayList;

public abstract class Transporte extends Maquinaria {

    private String marca;
    private ArrayList<IUbicable> carga = new ArrayList<>();

    ////////////////////////////////////////////////////////////////////

    public Transporte(int energia, int estado, IHabitable ubicacion, String marca) {
        super(energia, estado, ubicacion);
        this.marca = marca;
    }

    /////////////////////////////////////////////////////////////////////


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<IUbicable> getCarga() {
        return carga;
    }

    public void setCarga(ArrayList<IUbicable> carga) {
        this.carga = carga;
    }
}