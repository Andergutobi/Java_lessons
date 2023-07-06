package com.patxa.mundo_tolkien;

public class BarrilPolvora extends Mercaderia {

    private Integer capacidad;

    //////////////////////////////////////

    public BarrilPolvora(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer peso, Integer capacidad) {
        super(ubicacion, precio, calidad, material, contenido, peso);
        this.capacidad = capacidad;
    }


    ///////////////////////////////////////


    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


    ///////////////////////////////////////


    @Override
    public String toString() {
        return "BarrilPolvora{" +
                "capacidad=" + capacidad +
                "} " + super.toString();
    }
}
