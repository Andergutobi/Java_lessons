package com.patxa.interfaces_genericas;

public class MiClase1 implements MiInterface {


    @Override
    public String metodo1(String s) {
        return "hola mundo";
    }

    @Override
    public Boolean metodo2(Integer a, Integer b) {
        return true;
    }
}
