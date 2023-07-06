package com.joselu.set.treeset_con_objetos_comparator.models;

import java.util.Objects;

public class Estudiante {

    private int edad;
    private String nombre;
    private String ciudad;

    ///////////////////////////////////////////


    public Estudiante(int edad, String nombre, String ciudad) {
        this.edad = edad;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    ///////////////////////////////////////////


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Estudiante that = (Estudiante) o;
        //return this.edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(ciudad, that.ciudad);
        return this.edad == that.edad && this.nombre.equals(that.nombre) && this.ciudad.equals(that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre, ciudad);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }


}
