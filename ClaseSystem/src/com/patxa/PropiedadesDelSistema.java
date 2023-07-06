package com.patxa;

import java.util.Properties;

public class PropiedadesDelSistema {


    public static void main(String[] args) {

        //Obtener el nombre del usuario del sistema operativo
        System.out.println(System.getProperty("user.name"));

        //Obtener la home del sistema (directorio)
        System.out.println(System.getProperty("user.home"));

        //Obtener el workspace o directorio de trabajo
        System.out.println(System.getProperty("user.dir"));

        //Obtener la versión de Java (JRE)
        System.out.println(System.getProperty("java.version"));

        //Salto de linea del sistema
        String saltoDeLinea = System.getProperty("line.separator");
        System.out.println("El salto de linea es:" + saltoDeLinea + "Esto es otra línea" + saltoDeLinea + "Otra línea más");

        //Salto de línea de otra forma
        String saltoDeLinea2 = System.lineSeparator();
        System.out.println("El salto de linea es:" + saltoDeLinea2 + "Esto es otra línea" + saltoDeLinea2 + "Otra línea más");

        //Todas las propiedades del sistema
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);

    }

}
