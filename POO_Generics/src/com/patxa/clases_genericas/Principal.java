package com.patxa.clases_genericas;

public class Principal {

    public static void main(String[] args) {

        Vaca pepita = new Vaca();
        //Instanciación normal y corriente de una clase normal y corriente...
        Caja caja1 = new Caja("el dato");
        System.out.println("caja1: " + caja1.getDato());


        //Instanciación de una clase genérica
        CajaGenerica<Integer> caja2 = new CajaGenerica<Integer>(5);
        CajaGenerica<Vaca> caja3 = new CajaGenerica<Vaca>(pepita);


    }


}
