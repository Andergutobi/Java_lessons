package com.patxa.interfaces_genericas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        MiClase3 miObjeto3 = new MiClase3();

        //public interface List<E>
        //De esta forma decidimos cual es el tipo (E) genérico de List
        //En este caso hemos decidido que sean objetos de tipo MiClase3
        List<MiClase3> miLista = new ArrayList<>();
        miLista.add(miObjeto3);
        //miLIsta.add("hola"); //No admite un string

        //En este caso hemos decidido que sean objetos de tipo String
        List<String> miLista2 = new ArrayList<>();
        miLista2.add("hola");

        //Aquí decidimos lo que es T,Y y Z...
        MiInterfaceGenerica<Vaca, Transporte, Edificio> miObjeto4 = new MiClase3();


    }
}
