package com.patxa.enumeradores;

public enum TipoAutomovil {

    SEDAN("Sedán", 4, "Automóvil de tamaño mediano"),
    COUPE("Coupé", 2, "Automóvil deportivo"),
    FURGON("Furgón", 6, "Camioneta de transporte"),
    SUV("SUV", 5, "Todo terreno deportivo");

    ///////////////////////////////////////////////////

    private String nombre;
    private int nPuertas;
    private String descripcion;

    ////////////////////////////////////////////////////


    TipoAutomovil(String nombre, int nPuertas, String descripcion) {
        this.nombre = nombre;
        this.nPuertas = nPuertas;
        this.descripcion = descripcion;
    }

    ///////////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
