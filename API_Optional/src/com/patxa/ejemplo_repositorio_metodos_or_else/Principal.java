package com.patxa.ejemplo_repositorio_metodos_or_else;

import com.patxa.models.Ordenador;
import com.patxa.repositorio.IRepositorio;
import com.patxa.repositorio.OrdenadorRep;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //En vez de utilizar el método ifPresentOrElse
        //vamos a utilizar dos nuevos métodos: orElse y muy preferentemente el método orElseGet
        //También disponemos del método orElseThrow que sustituirá
        //próximamente al método (que se especula va a ser deprecado)
        //Como sabemos el método get se maneja conjuntamente con el isPresent
        //para evitar errores tipo nullPointerException y noSuchElementException

        IRepositorio<Ordenador> miRepositorio = new OrdenadorRep();

        //"Llamamos" a la BBDD para que nos devuelva todos los ordenadores
        List<Ordenador> miListadoOrdenadores = miRepositorio.listAll();


        //Ordenador ordenadorPorDefecto = new Ordenador("Acme","Coyote");

        //MÉTODO orElse DE UN OPTIONAL SIEMPRE DEVUELVE UN OBJETO

        /*Ordenador elOrdenador = miRepositorio.filtrar("Apple").orElse(ordenadorPorDefecto);
        System.out.println("elOrdenador = " + elOrdenador);*/

        //De la forma anterior vemos que vamos a crear un objeto que tal vez no utilicemos nunca
        //y para evitar esto disponemos del método orElseGet que debemos utilizar preferentemente:

        Ordenador elOrdenador2 = miRepositorio.filtrar("Applehh").orElseGet(() -> ordenadorPorDefecto());


    }


    private static Ordenador ordenadorPorDefecto() {

        System.out.println("Obteniendo un ordenador por defecto!!!");
        return new Ordenador("Acme", "Coyote");

    }


}
