package com.patxa.interfaces.polimorfismo;

public abstract class Edificio implements IHabitable {


    private int nEstancias;
    private String nombre;

    /////////////////////////////////////////////

    public Edificio(int nEstancias, String nombre) {
        this.nEstancias = nEstancias;
        this.nombre = nombre;
    }


    //////////////////////////////////////////////


    public int getnEstancias() {
        return nEstancias;
    }

    public void setnEstancias(int nEstancias) {
        this.nEstancias = nEstancias;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////////


    ///////////////////////////////////////////////
}
