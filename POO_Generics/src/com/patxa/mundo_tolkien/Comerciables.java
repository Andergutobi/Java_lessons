package com.patxa.mundo_tolkien;

public abstract class Comerciables extends MundoTolkien implements IComerciable {

    private Double precio;
    private Calidad calidad;
    private Material material;
    private String contenido;

    //////////////////////////////////////

    public Comerciables(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido) {
        super(ubicacion);
        this.precio = precio;
        this.calidad = calidad;
        this.material = material;
        this.contenido = contenido;
    }


    ////////////////////////////////////////

    @Override
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    ///////////////////////////////////////////


    @Override
    public String toString() {
        return "Comerciables{" +
                "precio=" + precio +
                ", calidad=" + calidad +
                ", material=" + material +
                "} " + super.toString();
    }
}
