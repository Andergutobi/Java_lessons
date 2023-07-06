package com.patxa.mundo_tolkien;

import java.util.ArrayList;
import java.util.List;

public abstract class MedioTransporte extends Comerciables {

    private List<Personaje> pasajeros = new ArrayList<>();
    private Integer tara;//Peso que puede soportar

    //////////////////////////////////////////

    public MedioTransporte(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, List<Personaje> pasajeros, Integer tara) {
        super(ubicacion, precio, calidad, material, contenido);
        this.pasajeros = pasajeros;
        this.tara = tara;
    }


    ///////////////////////////////////////////


    public List<Personaje> getPasajeros() {
        return pasajeros;
    }

    public Integer getTara() {
        return tara;
    }

    public void setTara(Integer tara) {
        this.tara = tara;
    }

    //////////////////////////////////////////


    @Override
    public String toString() {
        return "MedioTransporte{" +
                "pasajeros=" + pasajeros +
                ", tara=" + tara +
                "} " + super.toString();
    }
}
