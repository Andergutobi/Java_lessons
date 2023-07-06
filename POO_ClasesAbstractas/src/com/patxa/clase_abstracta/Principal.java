package com.patxa.clase_abstracta;

public class Principal {

    public static void main(String[] args) {


        Humanoide irwee = new ElfoOscuro();
        Caballo furia = new Caballo("Furia");
        System.out.println(irwee.cabalgar(furia));


    }

}
