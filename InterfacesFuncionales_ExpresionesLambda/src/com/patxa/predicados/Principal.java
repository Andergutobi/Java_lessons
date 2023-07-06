package com.patxa.predicados;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        //Crear una expresion Lambda de tipo Predicate que evalúe si un número es mayor que 10
        //Expresar el resultado en un operador ternario y sacarlo por consola
        Predicate<Integer> comparador = miNumeroEntero -> miNumeroEntero > 10;
        System.out.println(comparador.test(45) ? "Es mayor" : "Es menor o igual");

        //Crear una expresión Lambda de tipo Predicate que compruebe si el String que le proporcionamos
        //es igual a "ROLE_ADMIN".

        String miString = "Hola Mundo";
        String miString2 = new String("Hola Mundo");

        //System.out.println(miString==miString2);
        //System.out.println(miString.equals(miString2));

        Predicate<String> comprueba = elString -> elString.equals("ROLE_ADMIN");
        comprueba.test("ROLE_ADMIN");//TRUE

        //Crear algo parecido al método comprueba pero comparando dos String sin ser uno fijo
        //BiPredicate<String,String> comprueba2 = (s1,s2) -> s1.equals(s2);
        BiPredicate<String, String> comprueba2 = String::equals;
        System.out.println(comprueba2.test("hola", "hola"));


    }
}
