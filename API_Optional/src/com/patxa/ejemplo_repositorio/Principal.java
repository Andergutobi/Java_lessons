package com.patxa.ejemplo_repositorio;

import com.patxa.models.Ordenador;
import com.patxa.repositorio.IRepositorio;
import com.patxa.repositorio.OrdenadorRep;

import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        IRepositorio<Ordenador> repositorioOrdenador = new OrdenadorRep();
        List<Ordenador> resultado = repositorioOrdenador.listAll();

        //En este punto en el objeto repositorioOrdenador se ha recibido de la
        //BBDD. Dos ordenadores.

        //PROGRAMACIÓN TRADICIONAL SIN OPTIONAL:
        //Si no se encuentra el ordenador que cumapla el requerimiento vamos a tener que envolver esa expresión
        //en un try-catch para evitar un nullPointerException
        Ordenador pc = repositorioOrdenador.filtrarT("Apple");
        //System.out.println(pc.getMarca());//en caso de no-match esto provocaría un nullPointerException
        //Es facil evitar este error:
        if (pc == null) {
            System.out.println("No se encontró");
        } else {
            System.out.println(pc.getMarca());
        }

        //PROGRAMACIÓN TRADICIONAL CON OPTIONAL:
        Optional<Ordenador> pc2 = repositorioOrdenador.filtrar("Asusgsgsg ROG");

        if (pc2.isPresent()) {
            System.out.println(pc.getMarca());
        } else {
            System.out.println("No se encontró");
        }

        //PROGRAMACIÓN FUNCIONAL CON OPTIONAL:
        repositorioOrdenador.filtrar("Asusgsgsg ROG").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró"));//(CONSUMER,RUNNABLE)- CONSUMER EN CASO DE QUE EXISTA EL OBJETO Y EL RUNNABLE EN CASO DE QUE NO EXISTS


    }
}
