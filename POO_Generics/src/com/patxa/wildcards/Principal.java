package com.patxa.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //LAS WILDCARDS SOLO SE EMPLEAN CON COLECCIONES


        List<Persona> listaPersona = new ArrayList<>();

        listaPersona.add(new Persona("Pepe"));
        listaPersona.add(new Persona("Juana"));
        listaPersona.add(new Deportista("Iribar", "Fútbol"));


        Imprimir.imprimir(listaPersona);

        List<Deportista> listaDeportistas = new ArrayList<>();
        listaDeportistas.add(new Deportista("Iribar", "Fútbol"));
        listaDeportistas.add(new Deportista("Best", "Fútbol"));

        //POR POLIMORFISMO UN DEPORTISTA ES UNA PERSONA. ALLÁ DONDE SE PIDA UN OBJETO DE LA
        //CLASE PERSONA PODEMOS MANDAR OBJETOS QUE HEREDEN DE LA CLASE PERSONA.
        //PERO...NO EXISTE POLIMORFISMO ENTRE LAS CLASES: List<Persona> y List<Deportista>
        //AUNQUE DEPORTISTA HEREDE DE PERSONA.

        //Imprimir.imprimir(listaDeportistas);
        //Imprimir.imprimir2(new Deportista("Iribar","Fútbol"));//Ningún problema: un Deportista es polimórficamente una Persono


    }
}
