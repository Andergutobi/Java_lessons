package com.patxa.mundo_tolkien;

public abstract class MundoTolkien {

    private Ciudades ubicacion;


    ///////////////////////////////////


    public MundoTolkien(Ciudades ubicacion) {
        this.ubicacion = ubicacion;
    }

    ///////////////////////////////////


    public Ciudades getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ciudades ubicacion) {
        this.ubicacion = ubicacion;
    }

    ////////////////////////////////////////


    @Override
    public String toString() {
        return "MundoTolkien{" +
                "ubicacion=" + ubicacion +
                '}';
    }


}
