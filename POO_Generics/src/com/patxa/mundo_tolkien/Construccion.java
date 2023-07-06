package com.patxa.mundo_tolkien;

public abstract class Construccion extends Comerciables {


    /////////////////////////////////////

    public Construccion(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido) {
        super(ubicacion, precio, calidad, material, contenido);
    }


    ////////////////////////////////////////


    @Override
    public String toString() {
        return "Construccion{} " + super.toString();
    }
}
