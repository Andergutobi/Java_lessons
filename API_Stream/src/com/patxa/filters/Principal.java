package com.patxa.filters;

import com.patxa.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        //Filter es un operador intermedio de tipo PREDICATE
        //ACTUA DE LA SIGUIENTE FORMA: CUANDO DEVUELVE TRUE EL ELEMENTO
        //PERMANECE EN EL STREAM. DE LO CONTRARIO ES FILTRADO (ELIMINADO)
        List<Usuario> musicos = new ArrayList<>();
        musicos.add(new Usuario("Ritchie", "Blackmore"));
        musicos.add(new Usuario("David", "Gilmour"));
        musicos.add(new Usuario("David", "Coverdale"));
        musicos.add(new Usuario("Geddy", "Lee"));

        //TODOS LOS LIST Y TODOS LOS SETS TIENEN EL MÉTODO Stream()
        Stream<Usuario> musicosStream = musicos.stream();

        List<Usuario> davids = musicosStream
                .filter(u -> u.getNombre().equals("David")) //lo que me devuelve true acepta y lo que devuelve false lo elimina
                .collect(Collectors.toList());

        davids.forEach(System.out::println);


        //Dado el siguiente array {2,4,67,123,45,76,90,345}
        //conseguir un array list final de todos los elementos mayores o iguales a 50
        //Sacar los resultados por consola
        Integer[] numeros = {2, 4, 67, 123, 45, 76, 90, 345};

        //Stream<Integer> miStream = Arrays.stream(numeros);
        List<Integer> mayoresOIgualesA50 = Arrays.stream(numeros)
                .filter(n -> n >= 50)
                .toList();
        mayoresOIgualesA50.forEach(System.out::println);
    }
}
