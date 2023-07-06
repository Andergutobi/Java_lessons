package com.patxa;

import java.util.Objects;

public class Principal {

    public static void main(String[] args) {

        Perro fifi = new Perro("Fifí", "Azul", "Blanco");
        Gato elgato = new Gato("Sultán", "Marrón", "Negro");

        Perro dientitos = new Perro("Dientitos", "Marrón", "Negro");
        Perro sultan = new Perro("Sultán", "Marrón", "Negro");

        //Si lo único  que deseamos saber es si fifi, mizifuz y dientitos son la misma
        //instancia podemos utilizar directamente el operador ==

        System.out.println("El hashcode de Sultán es: " + sultan.hashCode());//873428244
        System.out.println("El hashcode de Dientitos es: " + dientitos.hashCode());//745887826
        System.out.println("El hashcode de elgato es: " + elgato.hashCode());//873428244


        System.out.println(dientitos.equals(sultan) ? "Son iguales" : "Son diferentes");

        Perro toby = null;
        Perro lagun = null;


        System.out.println(Objects.equals(toby, lagun) ? "Son iguales" : "Son diferentes");//Son iguales

        //System.out.println( toby.equals(lagun) ? "Son iguales" : "Son diferentes");//.NullPointerException


        System.out.println(sultan.equals(elgato));//Tienen el mismo hashcode...decide equals


    }
}
