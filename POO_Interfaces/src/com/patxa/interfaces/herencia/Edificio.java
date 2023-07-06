package com.patxa.interfaces.herencia;

public abstract class Edificio implements IUna {

    //Cuando una clase implementa una interface sus clases hijas heredan la interface
    //En ese caso la clase Granero no ha tenido mas remedio que implementar los
    //métodos de las interfaces IUna e IDos e ITres porque las hereada IUna

    public abstract void metodoEdificio();


}
