package com.patxa.models;

public class Procesador {

    private String modelo;
    private Fabricante fabricante;

    //////////////////////////////////////


    public Procesador(String modelo, Fabricante fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    ///////////////////////////////////////


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


    //////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Procesador{" +
                "modelo='" + modelo + '\'' +
                ", fabricante=" + fabricante +
                '}';
    }
}
