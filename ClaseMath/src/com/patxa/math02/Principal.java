package com.patxa.math02;

public class Principal {

    public static void main(String[] args) {

        //MÉTODO exp
        //Función exponencial. Devuelve e elevado a x que es es valor del argumento
        //Qué es e?
        System.out.println(Math.E);//2.718281828459045
        double resultadoExp = Math.exp(1);//2.718281828459045
        System.out.println("resultadoExp = " + resultadoExp);

        //MÉTODO log
        //Función logarítmica natural
        double resultadoLogaritmo = Math.log(10);//2.302585092994046
        System.out.println("resultadoLogaritmo = " + resultadoLogaritmo);

        //MÉTODO pow
        //Potencia
        double resultadoPow = Math.pow(10, 3);//10 elevado a 3 ==> 1000.0

        //MÉTODO sqrt
        //Raiz cuadrada
        double resultadoSQRT = Math.sqrt(100);//10


        //MÉTODO toDegrees
        //Covierte un ángulo expresado en radianes a grados
        double resultadoToDegrees = Math.toDegrees(1.57);//Cuantos grados son 1.57 radianes? ==> 89.95437383553924
        System.out.println(Math.round(resultadoToDegrees));

        //MÉTODO toRadians
        //Convierte un ángulo expresado en gradoa a radianes(
        double resultadoToRadians = Math.toRadians(90);//1.5707963267948966
        System.out.println("resultadoToRadians = " + resultadoToRadians);


        //MÉTODO sin
        //Calcula el seno de un ángulo expresado en radianes
        double resultadoSin = Math.sin(1.5707963267948966);//1


        //MÉTODO cos
        //Calcula el coseno de un ángulo expresao en radianes
        double resultadoCos = Math.cos(1.5707963267948966);//0


    }
}
