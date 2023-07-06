package com.joselu.set.treeset_con_objetos_comparator.comparators;

import com.joselu.set.treeset_con_objetos_comparator.models.Estudiante;

import java.util.Comparator;

public class OrdenarPorCiudad implements Comparator<Estudiante> {


    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {

        int resultado = estudiante1.getCiudad().compareToIgnoreCase(estudiante2.getCiudad());//Si el resultado es 0 el nombre de las dos ciudades es igual
        //SI LAS CIUDADES SE LLAMAN IGUAL Y SON OBJETOS DIFERENTES...
        if (resultado == 0 && !estudiante1.equals(estudiante2)) {

            return -1;
        }
        return resultado;

    }
}
