package com.patxa.wildcards;

import java.util.List;

public class Imprimir {

    public static void imprimir(List<? extends Persona> lista) {

        for (Persona laPersona : lista) {

            if (laPersona instanceof Deportista) {

                Deportista elDeportista = (Deportista) laPersona;
                System.out.println(elDeportista);

            } else {
                System.out.println(laPersona);
            }


        }


    }

    public static void imprimir2(Persona p) {

        System.out.println(p);
    }

}
