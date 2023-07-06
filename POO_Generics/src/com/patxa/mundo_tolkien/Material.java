package com.patxa.mundo_tolkien;

public enum Material {

    PIEDRA("Piedra"),
    MADERA("Madera"),
    ACERO("Acero"),
    ACEROELFICO("Acero Élfico"),
    COBRE("Cobre"),
    ORO("Oro"),
    PLATA("Plata"),
    HIERRO("Hierro"),
    PAJA("Paja");

    /////////////////////////////
    private String material;

    ////////////////////////////


    Material(String material) {
        this.material = material;
    }

    //////////////////////////////


    public String getMaterial() {
        return material;
    }

    ///////////////////////////////


    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                "} " + super.toString();
    }
}
