package com.patxa.models;

import java.util.Objects;

public class Usuario {

    private static Integer nUsuarios = 0;
    private String nombre;
    private String apellido;
    private Integer id;

    /////////////////////////////////////////////////


    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++nUsuarios;
    }

    ////////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }


    //////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
