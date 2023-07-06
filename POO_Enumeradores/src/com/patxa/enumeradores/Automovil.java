package com.patxa.enumeradores;

public class Automovil {

    private String modelo;
    private ColorAutomovil colorAutomovil;
    private Fabricante fabricante;
    private TipoAutomovil tipoAutomovil;

    ///////////////////////////////////////////


    public Automovil(String modelo, ColorAutomovil colorAutomovil, Fabricante fabricante, TipoAutomovil tipoAutomovil) {
        this.modelo = modelo;
        this.colorAutomovil = colorAutomovil;
        this.fabricante = fabricante;
        this.tipoAutomovil = tipoAutomovil;
    }

    ///////////////////////////////////////////////


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ColorAutomovil getColorAutomovil() {
        return colorAutomovil;
    }

    public void setColorAutomovil(ColorAutomovil colorAutomovil) {
        this.colorAutomovil = colorAutomovil;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    ////////////////////////////////////////////////////////

    public String acelerar() {

        return "Automovil acelerando";
    }

    //////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "====================================================================" + "\n" +
                "AUTOMOVIL" + "\n" +
                "Nombre del fabricante: " + this.fabricante.getNombre() + "\n" +
                "País del fabricante: " + this.fabricante.getPais() + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Tipo de automóvil: " + this.tipoAutomovil.getNombre() + "\n" +
                "Número de puertas: " + this.tipoAutomovil.getnPuertas() + "\n" +
                "Descripción: " + this.tipoAutomovil.getDescripcion() + "\n" +
                "Color: " + this.colorAutomovil.getColor() + "\n" +
                "Referencia del color: " + this.colorAutomovil.getRefColor() + "\n" +
                "====================================================================" + "\n";
    }


}
