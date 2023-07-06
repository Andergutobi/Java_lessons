package com.patxa.interfaces.polimorfismo;

public abstract class Animal implements IUbicable {

    private int estadoSalud;//0 mala salud
    private String nombre;
    private int edad;
    private String raza;
    private IHabitable ubicacion;

    ///////////////////////////////////////////////////

    public Animal(int estadoSalud, String nombre, int edad, String raza, IHabitable ubicacion) {
        this.estadoSalud = estadoSalud;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.ubicacion = ubicacion;
    }


    //////////////////////////////////////////////////////


    public int getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(int estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public IHabitable getUbicacion() {
        return ubicacion;
    }

    @Override
    public void setUbicacion(IHabitable ubicacion) {
        this.ubicacion = ubicacion;
    }
    //////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////
}
