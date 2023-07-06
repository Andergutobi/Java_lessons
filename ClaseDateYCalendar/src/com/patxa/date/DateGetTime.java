package com.patxa.date;

import java.util.Date;

public class DateGetTime {

    public static void main(String[] args) {

        //El método getTime devuelve un dato primitivo de tipo long
        //Representa una fecha en formato de los milisegundos transcurridos desde el 1 de enero de 1970

        Date ahora = new Date();
        long milisegundosDesdeElComienzo = ahora.getTime();
        System.out.println("milisegundosDesdeElComienzo = " + milisegundosDesdeElComienzo);//1684319187664

    }
}
