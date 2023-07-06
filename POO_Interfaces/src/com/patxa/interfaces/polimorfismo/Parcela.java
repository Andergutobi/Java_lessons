package com.patxa.interfaces.polimorfismo;

public abstract class Parcela implements IHabitable {

    private String nParcela;
    private String nombre;

    ///////////////////////////////////////////

    public Parcela(String nParcela, String nombre) {
        this.nParcela = nParcela;
        this.nombre = nombre;
    }


    //////////////////////////////////////////


    public String getnParcela() {
        return nParcela;
    }

    public void setnParcela(String nParcela) {
        this.nParcela = nParcela;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //////////////////////////////////////////////
}
