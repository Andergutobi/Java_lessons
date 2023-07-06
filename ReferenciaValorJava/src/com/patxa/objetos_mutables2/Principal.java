package com.joselu.objetos_mutables2;

import com.joselu.objetos_mutables.Animal;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        ArrayList<Animal> animales = new ArrayList<>();
        System.out.println("Antes de la llamada: " + animales.isEmpty());
        miMetodo(animales);
        System.out.println("Después de la llamada: " + animales.isEmpty());
        for (Animal elAnimal : animales) {

            System.out.println(elAnimal);
        }


    }


    public static void miMetodo(ArrayList animales2) {

        Animal miAnimal = new Animal();
        animales2.add(miAnimal);

        animales2 = new ArrayList<>();
        Animal miAnimal2 = new Animal();
        Animal miAnimal3 = new Animal();
        animales2.add(miAnimal2);
        animales2.add(miAnimal3);

    }


}
