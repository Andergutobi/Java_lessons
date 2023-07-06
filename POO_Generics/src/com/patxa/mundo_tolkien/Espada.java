package com.patxa.mundo_tolkien;

public class Espada extends Arma {

    private String nombre;


    /////////////////////////////////////

    public Espada(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer danho, String nombre) {
        super(ubicacion, precio, calidad, material, contenido, danho);
        this.nombre = nombre;
    }


    //////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /////////////////////////////////////////

    @Override
    public String toString() {
        return "Espada{" +
                "nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
