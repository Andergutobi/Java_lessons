package com.joselu.set.treeset_con_objetos_comparator.comparators;

import com.joselu.set.treeset_con_objetos_comparator.models.Estudiante;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        //La clave de la implementacón de este método es que nunca devuelva 0.
        //Si devolviera 0 el TreeSet consideraría iguales los objetos
        //y por lo tanto no los admitiría por considerarlos duplicados
        int resultado = estudiante1.getEdad() - estudiante2.getEdad();//puede ser positivo negativo o 0

        if (resultado == 0 && !estudiante1.equals(estudiante2)) {
            return -1;
        }

        return resultado;

    }
}
