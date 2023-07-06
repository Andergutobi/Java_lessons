package com.patxa.findfirst;

import com.patxa.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {


    public static void main(String[] args) {

        //Findfirst es un operador terminal

        List<Usuario> musicos = new ArrayList<>();
        musicos.add(new Usuario("Ritchie", "Blackmore"));
        musicos.add(new Usuario("David", "Gilmour"));
        musicos.add(new Usuario("David", "Coverdale"));
        musicos.add(new Usuario("David", "Coverdale"));
        musicos.add(new Usuario("Geddy", "Lee"));
        musicos.add(new Usuario("Geddy", "Lee"));

        Usuario resultado = musicos.stream()

                .filter(u -> u.getId().equals(4))
                .findFirst()
                .orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(resultado);

    }
}
