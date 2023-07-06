package com.patxa.mundo_tolkien;

public abstract class Arma extends Comerciables {


    private Integer danho;//0 a 10

    ////////////////////////////////

    public Arma(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer danho) {
        super(ubicacion, precio, calidad, material, contenido);
        this.danho = danho;
    }


    //////////////////////////////////////////


    public Integer getPeso() {
        return danho;
    }

    public void setPeso(Integer peso) {
        this.danho = peso;
    }

    //////////////////////////////////////////////


    @Override
    public String toString() {
        return "Arma{" +
                "danho=" + danho +
                "} " + super.toString();
    }
}
