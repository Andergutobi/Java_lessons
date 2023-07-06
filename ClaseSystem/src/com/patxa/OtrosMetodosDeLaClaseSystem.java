package com.patxa;

public class OtrosMetodosDeLaClaseSystem {

    public static void main(String[] args) {


        //Para imprimir errores
        System.err.println("Error. No se ha podido añadir el archivo");

        //Para liberar memoria (Garbage Collector)
        System.gc();

        //Para salir del programa
        System.exit(0); //Con status 0 el programa ha sido detenido sin error.
        //Si el status es 1 significa que el programa ha sido detenido por el programador por un error
        //grave. De esta forma forzamos la finalización del programa
        //Generalmente estará dentro del Catch de un Try-Catch
    }
}
