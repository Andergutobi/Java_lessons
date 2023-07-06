package com.patxa.proveedores;

import com.patxa.consumidores.models.Usuario;

import java.util.function.Supplier;

public class Principal {

    public static void main(String[] args) {

        //Crear una expresion Lambda de tipo Supplier que cree un objeto de tipo usuario
        //utilizando el constructor vacío
        //Supplier<Usuario> crearUsuario = ()->new Usuario();
        Supplier<Usuario> crearUsuario = Usuario::new;

        Usuario miUsuario = crearUsuario.get();
        System.out.println(miUsuario);


        //Crear un supplier que salude "Hola mundo Lambda supplier!!!"
        Supplier<String> miSaludo = () -> "Hola mundo Lambda supplier!!!";

        System.out.println(miSaludo.get());


    }
}
