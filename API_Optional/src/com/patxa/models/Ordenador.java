package com.patxa.models;

public class Ordenador {

    private String marca;
    private String modelo;
    private Procesador procesador;

    ////////////////////////////////////


    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    ///////////////////////////////////////////////


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    ////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
