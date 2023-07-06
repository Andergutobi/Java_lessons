package com.patxa.flatmap;

import com.patxa.models.Persona;
import com.patxa.models.Viaje;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Persona pepito = new Persona("Pepito");
        Persona juanito = new Persona("Juanito");

        Viaje francia = new Viaje("Francia");
        Viaje italia = new Viaje("Italia");
        Viaje marruecos = new Viaje("Marruecos");
        Viaje australia = new Viaje("Australia");
        Viaje japon = new Viaje("Japón");

        pepito.addViaje(francia);
        pepito.addViaje(japon);
        pepito.addViaje(marruecos);
        pepito.addViaje(italia);

        juanito.addViaje(australia);
        juanito.addViaje(japon);

        List<Persona> personas = new ArrayList<>();
        personas.add(pepito);
        personas.add(juanito);

        //SI POR EL MÉTODO TRADICIONAL (UTILIZANDO FOREACH) QUEREMOS OBTENER
        //UNA LISTA DE TODOS LOS VIAJES QUE HAN HECHO LAS PERSONAS DE LA LISTA
        for (Persona p : personas) {


            for (Viaje v : p.getListaViajes()) {

                System.out.println(p.getNombre() + " ha ido a " + v.getPaisDestino());
            }


        }

        //VAMOS A HACER LO MISMO UTILIZANDO PROGRAMACIÓN FUNCIONAL Y SU OPERADOR MAP


        /*personas.stream()
                .map(p->p.getNombre());*/


        //EN RESUMEN UN MAP RECIBE UN OBJETO DE UN TIPO Y DEVUELVE UN OBJETO DE ESE TIPO
        //O DE CUALQUIER OTRO TIPO
        //EN EL EJEMPLO ANTERIOR HEMOS CONVETIDO UN STREAM DE PERSONAS EN UN STREAM DE STRINGS.
        //LOS DATOS LOS HEMOS CONSEGUIDO FÁCILMENTE PERO SI DESEAMOS CONSEGUIR LOS PAÍSES DE
        //DESTINO LA COSA SE COMPLICA...


        //SI UTILIZAMOS EL OPERADOR FLATMAP LA TAREA SE SIMPLIFICA...
        //LOS FLATMAP DEVUELVEN STREAMS
        //ES BUENA IDEA QUE CADA VEZ QUE RECIBAMOS EN UN STREAM UNA LISTA
        //UTILICEMOS UN FLATMAP PARA CONVERTILA EN UN STREAM DE SU TIPO GENÉRICO.
        //SI POSTERIORMENTE UTILIZAMOS UN MAP (POR EJEMPLO...) TENDREMOS ACCESO
        //A LOS ATRIBUTOS DEL LIST ETC. DIRECTAMENTE.

        List<String> viajes = personas.stream()
                .map(p -> p.getListaViajes())
                .flatMap(lv -> lv.stream())
                .map(v -> v.getPaisDestino())
                .toList();

        viajes.forEach(System.out::println);


    }
}
