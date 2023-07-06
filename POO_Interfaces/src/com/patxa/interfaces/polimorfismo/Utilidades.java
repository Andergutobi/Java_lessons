package com.patxa.interfaces.polimorfismo;

public class Utilidades {


    public static boolean compararUbicacion(IUbicable o1, IUbicable o2) {
        //Este metodo comprueba si dos objetos IUbicable están en el mismo lugar
        //devolviendo true en caso afirmativo y false en caso negativo

        //System.out.println( o1.getUbicacion().getClass().getSimpleName());
        //System.out.println( o2.getUbicacion().getClass().getSimpleName())

        return o1.getUbicacion() == o2.getUbicacion();
    }


    public static IHabitable dondeEsta(IUbicable elUbicable) {

        return elUbicable.getUbicacion();

    }


}


