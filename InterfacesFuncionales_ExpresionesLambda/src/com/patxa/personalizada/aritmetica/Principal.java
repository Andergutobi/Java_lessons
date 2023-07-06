package com.patxa.personalizada.aritmetica;

public class Principal {

    public static void main(String[] args) {

        Aritmetica<Double> suma = Double::sum;//método referencia
        Aritmetica<Double> resta = (a, b) -> a - b;
        Aritmetica<Double> multiplicacion = (a, b) -> a * b;
        Aritmetica<Double> division = (a, b) -> a / b;

        Double resultadoSuma = Calculadora.computar(345.67, 123.09, suma);
        System.out.println("resultadoSuma = " + resultadoSuma);

        Double resultadoSuma2 = Calculadora.computar(345.67, 123.09, Double::sum);
        System.out.println("resultadoSuma2 = " + resultadoSuma2);

        Double resultadoResta = Calculadora.computar(345.67, 123.09, resta);
        System.out.println("resultadoResta = " + resultadoResta);

        Double resultadoResta2 = Calculadora.computar(345.67, 123.09, (a, b) -> a - b);

        Double resultadoMultiplicacion = Calculadora.computar(345.67, 123.09, multiplicacion);
        Double resultadoMultiplicacion2 = Calculadora.computar(345.67, 123.09, (a, b) -> a * b);

        Double resultadoDivisión = Calculadora.computar(345.67, 123.09, division);
        Double resultadoDivisión2 = Calculadora.computar(345.67, 123.09, (a, b) -> a / b);

        //Utilizando BiFunction
        Double resultadoSumaBifunction = Calculadora.computarConBiFunction(345.67, 123.09, Double::sum);


    }
}
