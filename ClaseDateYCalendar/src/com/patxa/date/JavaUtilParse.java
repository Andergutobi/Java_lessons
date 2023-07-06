package com.patxa.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilParse {

    public static void main(String[] args) {

        //Recibimos de una BBDD un array de strings e, independientemente  del
        //número de fechas que recibamos tenemos que pasarlas a un formato Date
        //y dejarlas en un array de tipo Date

        String[] misFechasString = {"23/04/2021", "03/02/2018", "jskkhfk", "03/02/2021", "03/05/1987", "jafafjaj"};

        Date[] misFechasDate = new Date[misFechasString.length];

        //Necesitamos un objeto de la clase SimpleDateFormar
        SimpleDateFormat miFormato = new SimpleDateFormat("dd/MM/yyyy");
        int c = 0;

        for (String mfs : misFechasString) {

            Date miFechaDate = null;

            try {
                miFechaDate = miFormato.parse(mfs);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            misFechasDate[c] = miFechaDate;
            c++;


        }

        //Recorremos el contenido del array de Date para comprobar que ha ido correctamente
        for (Date fecha : misFechasDate) {

            System.out.println(fecha);
        }


    }
}
