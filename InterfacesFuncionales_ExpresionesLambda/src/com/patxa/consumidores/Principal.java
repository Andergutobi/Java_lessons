package com.patxa.consumidores;

import com.patxa.consumidores.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Principal {

    public static void main(String[] args) {

        //EJEMPLO DE INTERFACE FUNCIONAL DE TIPO CONSUMER
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(sdf.format(fecha));
        };

        consumidor.accept(new Date());

        //EJEMPLO DE INTERFACE FUNCIONAL DE TIPO BI-CONSUMER
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {

            System.out.println(nombre + " tiene " + edad + " años.");
        };

        consumidorBi.accept("Pepito", 23);


        //CREAR UNA EXPRESIÓN LAMBDA DE TIPO CONSUMER QUE IMPRIMA POR CONSOLA UN MENSAJE:

        //Consumer<String> miFuncion = mensaje -> System.out.println(mensaje);
        Consumer<String> miFuncion = System.out::println;

        miFuncion.accept("Qué tal?");

        //Crear un paquete Models con una clase llamada Usuario. Esta clase va a tener un atributo
        //de tipo String llamado nombre
        //Crear un consumidor que asigne el nombre al usuario y sacarlo por consola

        BiConsumer<Usuario, String> asignarNombre = (usuario, nombre) -> {

            usuario.setNombre(nombre);
            System.out.println("usuario = " + usuario);

        };

        asignarNombre.accept(new Usuario(), "Pepe");


    }
}
