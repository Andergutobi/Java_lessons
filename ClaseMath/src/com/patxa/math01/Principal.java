package com.patxa.math01;

public class Principal {

    public static void main(String[] args) {


        //ALGUNOS MÉTODOS DE LA CLASE MATH
        //MÉTODO abs
        //Calcula el valor absoluto de un número dado ya sea positivo o negativo
        int valorAbsoluto = Math.abs(-432);//432

        double valorAbsoluto2 = Math.abs(-456.76);//456.76

        //MÉTODO max
        //Calcula el valor máximo entre dos valores numéricos
        long valorMayor = Math.max(34567, -87654);//34567

        //MÉTODO min
        //Calcula el valor mínimo entre dos valores numéricos
        double valorMinimo = Math.min(98.89, 98.88);//98.88


        //MÉTODO round
        //Redondea un valor numérico al entero más próximo
        long valorRedondeado = Math.round(890.499);//890
        System.out.println("valorRedondeado = " + valorRedondeado);

        //MÉTODO floor
        //Redondea un valor decimal hacia abaajo
        double valorRedondeadoHaciaAbajo = Math.floor(123.345);//123.0
        System.out.println("valorRedondeadoHaciaAbajo = " + valorRedondeadoHaciaAbajo);

        double valorRedondeadoHaciaAbajo2 = Math.floor(123.999);//123.0
        System.out.println("valorRedondeadoHaciaAbajo2 = " + valorRedondeadoHaciaAbajo2);


        //MÉTODO ceil
        //Redondea un valor decimas hacia arriba
        double valorRedondeadoHaciaArriba = Math.ceil(123.000000001);//124.0
        System.out.println("valorRedondeadoHaciaArriba = " + valorRedondeadoHaciaArriba);

        double valorRedondeadoHaciaArriba2 = Math.ceil(-123.99999);//-123.0
        System.out.println("valorRedondeadoHaciaArriba2 = " + valorRedondeadoHaciaArriba2);


    }
}
