package com.joselu.set.treeset_con_objetos_comparator;

import com.joselu.set.treeset_con_objetos_comparator.comparators.OrdenarPorCiudad;
import com.joselu.set.treeset_con_objetos_comparator.comparators.OrdenarPorEdad;
import com.joselu.set.treeset_con_objetos_comparator.comparators.OrdenarPorNombre;
import com.joselu.set.treeset_con_objetos_comparator.models.Estudiante;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

        //Set<Estudiante> estudiantes = new TreeSet<>(new OrdenarPorEdad());//Necesitamos un elemento comparador en el contructor
        //Set<Estudiante> estudiantes = new TreeSet<>(new OrdenarPorCiudad());
        Set<Estudiante> estudiantes = new TreeSet<>(new OrdenarPorNombre());

        Estudiante pepe = new Estudiante(34, "Pepe", "Bilbao");
        Estudiante julia = new Estudiante(23, "Julia", "Burgos");
        Estudiante alvaro = new Estudiante(14, "Alvaro", "Zaragoza");
        Estudiante rosa = new Estudiante(44, "Rosa", "Bilbao");
        Estudiante antonia = new Estudiante(44, "Antonia", "Bilbao");
        Estudiante pedro = new Estudiante(4, "Pedro", "Albacete");
        Estudiante pedro2 = new Estudiante(5, "Pedro", "Zaragoza");
        Estudiante pedro3 = new Estudiante(5, "Pedro", "Zaragoza");


        System.out.println(pepe.hashCode());
        System.out.println(julia.hashCode());
        System.out.println(alvaro.hashCode());
        System.out.println(rosa.hashCode());
        System.out.println(antonia.hashCode());
        System.out.println(pedro.hashCode());
        System.out.println(pedro2.hashCode());
        System.out.println(pedro3.hashCode());


        estudiantes.add(pepe);
        estudiantes.add(julia);
        estudiantes.add(alvaro);
        estudiantes.add(rosa);
        estudiantes.add(antonia);
        estudiantes.add(pedro);
        estudiantes.add(pedro2);
        estudiantes.add(pedro3);

        estudiantes.forEach(System.out::println);


    }
}
