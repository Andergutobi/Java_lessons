package com.patxa.interfaces.polimorfismo;

public class Operario extends Personal {


    public Operario(int salario, String nombre, int edad, boolean disponible, int estadoSalud, int destreza, IHabitable ubicacion) {
        super(salario, nombre, edad, disponible, estadoSalud, destreza, ubicacion);
    }
}
