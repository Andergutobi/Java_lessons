package com.patxa.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {

        Date miFecha = new Date();
        System.out.println("miFecha = " + miFecha);//Wed May 17 12:12:51 CEST 2023

        SimpleDateFormat miFormatoDeFecha = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat miFormatoDeFecha2 = new SimpleDateFormat("dd-MM-yy");
        String miFechaFormateada = miFormatoDeFecha.format(miFecha);
        String miFechaFormateada2 = miFormatoDeFecha2.format(miFecha);
        System.out.println("miFechaFormateada = " + miFechaFormateada);//17 mayo 2023
        System.out.println("miFechaFormateada2 = " + miFechaFormateada2);//17-05-23


    }
}