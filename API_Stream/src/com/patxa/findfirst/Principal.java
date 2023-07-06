package com.patxa.findfirst;

import com.patxa.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        //Findfirst es un operador terminal

        List<Usuario> musicos = new ArrayList<>();
        musicos.add(new Usuario("Ritchie", "Blackmore"));
        musicos.add(new Usuario("David", "Gilmour"));
        musicos.add(new Usuario("David", "Coverdale"));
        musicos.add(new Usuario("David", "Coverdale"));
        musicos.add(new Usuario("Geddy", "Lee"));
        musicos.add(new Usuario("Geddy", "Lee"));

        Optional elMusico = musicos.stream()
                .distinct()
                .findFirst();

        if (elMusico.isPresent()) {

            System.out.println("El músico es: " + elMusico.get());

        }


    }
}
