package com.patxa.java_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Principal {

    public static void main(String[] args) {

        //EL PAQUETE JAVA.TIME
        //El paquete java.time incluye muchas clases pero las más utilizadas son:
        // LocalDate: representa fechas sin hora
        // LocalTime: representa horas
        // LocalDateTime: combina las dos anteriores

        //CREANDO FECHAS CON JAVA TIME
        //Todos los métodos anteriores producen instancias inmutables
        //al contrario que Date y Calendar.
        //Estas clases carecen de constructores públicos y se instancias
        //mediante métodos "factory":
        // now(): crea instancias a partir de la fecha y hora actual
        // of(): construyen fechas y horas a partir de las partes de una fecha
        // with(): modifican la fecha a partir de un parámetro

        //Utilizando el método factory now
        System.out.println("La fecha de hoy es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y la hora actual es: " + LocalDateTime.now());

        //Utilizando el método factory of
        LocalDate miLocalDate = LocalDate.of(1971, Month.APRIL, 8);
        LocalDate miLocalDate2 = LocalDate.of(1971, 4, 3);
        System.out.println("Fecha de mi cumpleaños: " + miLocalDate);
        LocalTime miLocalTime = LocalTime.of(13, 41, 45);
        System.out.println("Hora de la cita: " + miLocalTime);
        System.out.println("Fecha y hora del concierto: " + LocalDateTime.of(miLocalDate, miLocalTime));
        System.out.println("Fecha y hora del concierto: " + LocalDateTime.of(2023, 6, 16, 21, 30));

        //SI INTENTAMOS PASAR UNA FECHA INCORRECTA A UN MÉTODO FACTORÍA SE PRODUCIRÁ UNA EXCEPCIÓN:
        //System.out.println("Día bisiesto del año 2019: " + LocalDate.of(2019,Month.FEBRUARY,29));//DateTimeException

        //Podemos extraer cualquier parte de una fecha o una hora a través de los métodos "get" que establecen
        //estas clases:
        // getHour()
        // getMinute()
        // getMonth()
        // getDayOfWeek()
        Month miMes = miLocalDate.getMonth();

        //OBTENIENDO FECHAS Y HORAS A PARTIR DE OTRAS
        //LocalDate
        // plusDays() y minusDays():  sumamos a restamos días a la fecha (Si utilizamos plusDays() pasando valores negativos obtenemos el mismo resultado que utilizando minusDays()
        // plusWeeks() y minusWeeks()
        // plusMonths() y minusMonths()
        // plusYears() y minusYears()


        //LocalTime
        // plusSeconds() y minusSeconds()
        // plusMinutes() y minusMinutes()
        // plusNanos() y minusNanos()
        // plusHours() y minusHours()

        //La fecha de dentro de 10 dias

        System.out.println("La fecha de dentro de 10 días es: " + LocalDate.now().plusDays(10));

        //La fecha y hora de hace 32 horas

        System.out.println("La fecha y hora de hace 32 horas: " + LocalDateTime.now().minusHours(32));

        //RECORDAR QUE LOS OBJETOS DE LAS CLASES DE JAVA.TIME SON INMUTABLES.


        //Ajustadores temporales
        //Aparte de los métodos vistos de suma y resta de fechas, horas etc. existe una clase especializada
        //llamada TemporalAdjuster.
        //Existe una clase "factory" TemporalAdjusters cuyos métodos nos permiten obtener ajustes de fecha de
        //un objeto TemporalAdjuster.

        //Obtener el primer día del próximo mes de una determinada fecha (de hoy):
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());


        //Tiempo transcurrido entre fechas y horas
        //Si deseamos obtener la diferencia entre dos fechas, dos horas etc.(el tiempo transcurrido entre
        //dos instantes de tiempo...
        //Para ello disponemos de:
        // 1) Una interface java.time.temporal.TemporalUnit
        // 2) Un enumerador ChonoUnit
        // 3) Una clase Period

        //Que con sus métodos:
        // between(): tiempo transcurrido entre dos instantes
        // until(): tiempo que falta para llegar a un instante determinado

        //Obtener el tiempo transcurrido entre nuestro nacimiento y hoy:

        LocalDate fNacimiento = LocalDate.of(1972, Month.APRIL, 8);
        System.out.println("Mi edad es: " + ChronoUnit.YEARS.between(fNacimiento, LocalDate.now()));

        //Obtener el tiempo que falta para llegar a fin de año:
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnho = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinAnho = hoy.until(finDeAnho);

        int meses = hastaFinAnho.getMonths();
        int dias = hastaFinAnho.getDays();

        System.out.println("Faltan: " + meses + " meses y " + dias + " días hasta el final del año");

        //La clase Period también dispone del método estático between() para obtener el periodo entre
        //dos elementos de tiempo:

        Period hastaFinDeAnho = Period.between(hoy, finDeAnho);


        //Parseando fechas
        //Es común tener que interpretar fechas a partir de una cadena proviniente de una BBDD
        //La clase java.time nos ofrece el método sobrecargado parse() que se ocupa de esta tarea:
        //1) La primera sobrecarga recibe únicamente una cadena a interpretar
        //2) La segunda sobrecarga añede un formateador especializado si lo necesitamos

        String laFecha = "2020-07-06";
        LocalDate fechaLocalDate = LocalDate.parse(laFecha);
        System.out.println("fechaLocalDate = " + fechaLocalDate);

        String laFecha2 = "6/11/2020";
        LocalDate otraFecha = LocalDate.parse(laFecha2, DateTimeFormatter.ofPattern("d/M/yyyy"));
        System.out.println("otraFecha = " + otraFecha);


        //La clase DateTimeFormatter posee infinidad de formatos predefinidos en forma de constantes


    }
}
