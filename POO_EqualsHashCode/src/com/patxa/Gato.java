package com.patxa;

import java.util.Objects;

public class Gato {


    private String nombre;
    private String colorOjos;
    private String colorPelo;

    //////////////////////////////////////////


    public Gato(String nombre, String colorOjos, String colorPelo) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
    }

    ////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }


    ///////////////////////////////////////////////

    public String maullar() {

        return "gato maullando";
    }

    public String correr() {

        return "gato corriendo";
    }

    ///////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nombre, gato.nombre) && Objects.equals(colorOjos, gato.colorOjos) && Objects.equals(colorPelo, gato.colorPelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, colorOjos, colorPelo);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }
}
