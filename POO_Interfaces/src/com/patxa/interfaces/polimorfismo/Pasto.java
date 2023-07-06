package com.patxa.interfaces.polimorfismo;

public class Pasto extends Parcela {

    private boolean estadoPasto;//true hay hierba, false no hay hierba

    /////////////////////////////////////////////////////////////

    public Pasto(String nParcela, String nombre, boolean estadoPasto) {
        super(nParcela, nombre);
        this.estadoPasto = estadoPasto;
    }


    //////////////////////////////////////////////////////////////


    public boolean isEstadoPasto() {
        return estadoPasto;
    }

    public void setEstadoPasto(boolean estadoPasto) {
        this.estadoPasto = estadoPasto;
    }

    ////////////////////////////////////////////////////////////////
}
