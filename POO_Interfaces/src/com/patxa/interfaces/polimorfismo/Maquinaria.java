package com.patxa.interfaces.polimorfismo;

public abstract class Maquinaria implements IUbicable {

    private int energia;//de 0 a 10 siendo 0 deposito vacio, 10 deposito lleno
    private int estado;//de 0 a 10 siendo 10 un estado optimo.
    private IHabitable ubicacion;

    ////////////////////////////////////////////////////////////

    public Maquinaria(int energia, int estado, IHabitable ubicacion) {
        this.energia = energia;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }


    /////////////////////////////////////////////


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public IHabitable getUbicacion() {
        return ubicacion;
    }

    @Override
    public void setUbicacion(IHabitable ubicacion) {
        this.ubicacion = ubicacion;
    }
}
