package com.patxa.maps;

import com.patxa.models.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        //Map es un operador intermedio de tipo FUNCTION

        /*Stream.of("José Jurado","Antonio Resines","Rosa López")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .forEach(System.out::println);*/

        List<Usuario> listUsuarios = Stream.of("José Jurado", "Antonio Resines", "Rosa López")
                .map(s -> new Usuario(s.split(" ")[0], s.split(" ")[1]))
                .peek(System.out::println)
                .map(u -> {
                    u.setNombre(u.getNombre().toUpperCase());
                    return u;
                })
                .toList();

        //usuarios.forEach(System.out::println);

        //List<Usuario> listUsuarios = usuarios.collect(Collectors.toList());//collect es un operador final
        //List<Usuario> listUsuarios = usuarios.toList();//Es lo mismo que la linea anterior

        listUsuarios.forEach(u -> System.out.println(u.getNombre()));//Este forEach no es del Stream, es del List!!!


    }
}


