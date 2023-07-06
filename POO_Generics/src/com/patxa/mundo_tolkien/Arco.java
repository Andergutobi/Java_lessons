package com.patxa.mundo_tolkien;

public class Arco extends Arma {

    private Integer tamaho;


    /////////////////////////////////////////


    public Arco(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer danho, Integer tamaho) {
        super(ubicacion, precio, calidad, material, contenido, danho);
        this.tamaho = tamaho;
    }
}
