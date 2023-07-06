package com.patxa.models;

public class Viaje {

    private String paisDestino;

    ////////////////////////////////////////////

    public Viaje(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    //////////////////////////////////////////////


    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }


    ///////////////////////////////////////////////


    @Override
    public String toString() {
        return "Viaje{" +
                "paisDestino='" + paisDestino + '\'' +
                '}';
    }


}
