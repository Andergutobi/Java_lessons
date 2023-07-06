package com.patxa.personalizada.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public static Double computar(Double a, Double b, Aritmetica<Double> lambda) {

        return lambda.operacion(a, b);
    }

    //Vamos a crear un método parecido a computar pero utilizando una interfaz genérica de tipo BiFunction
    //En resumidas cuentas podríamos haber utilizado un BiFuncion desde el principio sin necesidad
    //de utilizar una interfaz genérica personalizada
    public static Double computarConBiFunction(Double a, Double b, BiFunction<Double, Double, Double> lambda) {

        return lambda.apply(a, b);

    }

    ;


}
