package com.patxa.creacion_optional;

import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        String nombre = "Gumersindo";

        //Creamos un optional a partir de un String con el método of
        //Existe también el método ofNullable y empty
        //Con el método of no podemos meter valores null
        //Con el método ofNullable si
        //El método empty crea un optional vacío

        //CREACIÓN DE UN OPTIONAL UTILIZANDO EL MÉTODO "FACTORÍA" OF
        Optional<String> miOptional = Optional.of(nombre);
        System.out.println("miOptional = " + miOptional);//Optional[Gumersindo]
        System.out.println(miOptional.isPresent());//true//El método isPresent nos indica si el optional contiene un objeto (true) o no contiene un null (false)

        //Si queremos extraer el objeto del optional primero debemos comprobar si existe para evitar noSuchElementException:

        if (miOptional.isPresent()) {

            String elString = miOptional.get();
            System.out.println("elString = " + elString);

        } else {

            System.out.println("El optional contiene un null");
        }


        //CREACIÓN DE UN OPTIONAL UTILIZANDO EL MÉTODO "FACTORÍA" OFNULLABLE
        nombre = "Evaristo";

        Optional miOptionaNullable = Optional.ofNullable(nombre);
        System.out.println("miOptionaNullable = " + miOptionaNullable);//Optional.empty
        System.out.println(miOptionaNullable.isPresent());//false
        System.out.println(miOptionaNullable.isEmpty());//true

        //Método isPresentOrElse
        //A este método que pertenece a los objetos Optional se se pasa un parámetro que es una expresión Lambda de tipo Consumer
        //y como segundo parámetro se le pasa un objeto "Runnable" (Básicamente es una función que se va a ejecutar en el caso
        //de el Observable contenga null
        //Es una mánera práctica que nos da la API para evitar tener que hacer una comprobación tan tediosa como en el ejemplo
        //anterior utilizando el clásico if-else

        miOptionaNullable.ifPresentOrElse(valor -> System.out.println(valor), () -> System.out.println("el objeto está vacío"));


        //CREACIÓN DE UN OPTIONAL UTILIZANDO EL MÉTODO "FACTORÍA" EMPTY

        Optional<String> miOptionalEmpty = Optional.empty();
        System.out.println("miOptionalEmpty = " + miOptionalEmpty);//Optional.empty
        System.out.println(miOptionalEmpty.isPresent());//false

        //La diferencia que hay entre null y empty es que empty describe un objeto Optional vacío (no contiene tan siquiera un elemento null)

    }
}
