package com.patxa.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {

    public static void main(String[] args) {

        Calendar miCalendario = Calendar.getInstance();

        miCalendario.set(2023, 0, 23, 10, 12, 34);

        //Vamos a pasar de formato Calendar a formato Date
        Date miDate = miCalendario.getTime();
        System.out.println("miDate = " + miDate);

        //Ahora que tenemos la fecha en formato Date vamos a pasarla a un formato "humano"
        SimpleDateFormat miFormato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        System.out.println(miFormato.format(miDate));


    }
}
