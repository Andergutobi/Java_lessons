package com.patxa.mundo_tolkien;

public abstract class Mercaderia extends Comerciables {


    private Integer peso;

    /////////////////////////////////////

    public Mercaderia(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer peso) {
        super(ubicacion, precio, calidad, material, contenido);
        this.peso = peso;
    }


    //////////////////////////////////////


    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /////////////////////////////////////////


    @Override
    public String toString() {
        return "Mercaderia{" +
                "peso=" + peso +
                "} " + super.toString();
    }
}
