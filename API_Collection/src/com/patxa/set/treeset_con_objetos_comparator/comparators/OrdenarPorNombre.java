package com.joselu.set.treeset_con_objetos_comparator.comparators;

import com.joselu.set.treeset_con_objetos_comparator.models.Estudiante;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {

        int resultado = estudiante1.getNombre().compareToIgnoreCase(estudiante2.getNombre());//Si el resultado es 0 el nombre  es igual
        //SI SE LLAMAN IGUAL Y SON OBJETOS DIFERENTES...
        if (resultado == 0 && !estudiante1.equals(estudiante2)) {

            return -1;
        }
        return resultado;

    }
}
