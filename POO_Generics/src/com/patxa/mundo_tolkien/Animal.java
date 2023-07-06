package com.patxa.mundo_tolkien;

public abstract class Animal extends MundoTolkien {

    private Boolean domesticado;
    private String nombre;

    ////////////////////////////////////////////////


    public Animal(Ciudades ubicacion, Boolean domesticado, String nombre) {
        super(ubicacion);
        this.domesticado = domesticado;
        this.nombre = nombre;
    }


    ////////////////////////////////////////////////////////


    public Boolean getDomesticado() {
        return domesticado;
    }

    public void setDomesticado(Boolean domesticado) {
        this.domesticado = domesticado;
    }


    ///////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Animal{" +
                "domesticado=" + domesticado +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
