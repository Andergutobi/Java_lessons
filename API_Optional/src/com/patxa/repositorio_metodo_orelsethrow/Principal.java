package com.patxa.repositorio_metodo_orelsethrow;

import com.patxa.models.Ordenador;
import com.patxa.repositorio.IRepositorio;
import com.patxa.repositorio.OrdenadorRep;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        //Hay ocasiones en las que la aplicación no puede continuar
        //en el caso de que por ejemplo el método filtrar devuelva null
        //y nos veamos obligados a lanzar una excepción.
        //Aquí entra en juego el método orElseThrow que se comporta
        //como el método get éste no nos avisa. Es incapaz de avisarnos
        //de que puede generarse un posible error.
        //Esto por esto por lo que el método get tiende a ser deprecado.

        IRepositorio<Ordenador> repositorioOrdenador = new OrdenadorRep();
        repositorioOrdenador.listAll();//De esta forma cargamos los datos en el dataSource

        Optional<Ordenador> miOptional = repositorioOrdenador.filtrar("Asus ROG");
        System.out.println("miOptional = " + miOptional);
        //System.out.println(miOptional.get());//NoSuchElementException - Si no hay match

        //System.out.println(miOptional.orElseThrow(NoSuchElementException::new));

        try {

            System.out.println(miOptional.orElseThrow(NoSuchElementException::new));

        } catch (NoSuchElementException e) {

            System.out.println("Excepción capturada: " + e.getMessage());

        } finally {

            System.out.println("Aquí entramos si o si. Se produzca o no la excepción");

        }


    }
}
