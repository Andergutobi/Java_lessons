package com.patxa.mundo_tolkien;

public class BarrilCerveza extends Mercaderia {

    private String tipo;
    private Integer capacidad;

    //////////////////////////////////////

    public BarrilCerveza(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, Integer peso, String tipo, Integer capacidad) {
        super(ubicacion, precio, calidad, material, contenido, peso);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }


    ///////////////////////////////////////


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    ////////////////////////////////////////////////


    @Override
    public String toString() {
        return "BarrilCerveza{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                "} " + super.toString();
    }
}
