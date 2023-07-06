package com.patxa.excepciones2;

public class Calculadora {

    public static double dividir(Double dividendo, Double divisor) throws DivisionCeroException {

        if (divisor == 0) {
            throw new DivisionCeroException("División por 0");
            //Tenemos la obligación de propagar la exception ya que es chequed
        }

        return dividendo / divisor;

    }
}
