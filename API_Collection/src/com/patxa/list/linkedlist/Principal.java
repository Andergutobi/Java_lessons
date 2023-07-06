package com.joselu.list.linkedlist;

import com.joselu.list.models.Arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //En esta ocasión, con los LinkedList, no vamos
        //a emplear el polimorfismo de asignación utilizando
        //la interface List sino que vamos a emplear la clase propia.
        //Esto es porque si empleamos el objeto arboles como List
        //no vamos a tener acceso a ciertos métodos que tienen los LinkedList

        LinkedList<Arbol> arboles = new LinkedList<>();
        LinkedList<Arbol> arboles3 = new LinkedList<>();
        ArrayList<Arbol> arboles2 = new ArrayList<>();

        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Roble", 10));
        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Nogal", 9));
        arboles.add(new Arbol("Nogal", 11));
        arboles.add(new Arbol("Cerezo", 6));
        arboles.add(new Arbol("Cerezo", 8));
        arboles.add(new Arbol("Almendro", 3));
        arboles.add(new Arbol("Limonero", 6));


        System.out.println("ORDEN NATURAL DE ENTRADA: " + arboles);

        //Los array list carecen de muchos métodos que tienen los linked list
        //addFist
        arboles.addFirst(new Arbol("Mandarino", 4));

        System.out.println("===========================================================");
        arboles.forEach(System.out::println);

        //addLast
        arboles.addLast(new Arbol("Secuoya", 120));

        System.out.println("===========================================================");
        arboles.forEach(System.out::println);

        //getFirst
        //Devuelve el primer elemento pero lanza la excepción "NoSuchElementException" en caso de no encontrarlo
        System.out.println("===========================================================");
        System.out.println(arboles.getFirst());
        //System.out.println(arboles3.getFirst());//NoSuchElementException

        //getLast
        //Devuelve el  último pero lanza la excepción "NoSuchElementException" en caso de no encontrarlo
        System.out.println("===========================================================");
        System.out.println(arboles.getLast());
        //System.out.println(arboles3.getLast());//NoSuchElementException

        //peekFirst
        //Devuelve el primer elemento. Devuelve null si la lista está vacía ==> no lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.peekFirst());
        Arbol arbolElegido = arboles.peekFirst();
        System.out.println(arboles3.peekFirst());//null

        //peekLast
        //Devuelve el último elemento. Devuelve null si la lista está vacía ==> no lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.peekLast());
        System.out.println(arboles3.peekLast());//null


        //peek
        //Devuelve el primer elemento. Devuelve null si la lista está vacía ==> no lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.peek());
        System.out.println(arboles3.peek());//null

        //MÉTODOS DE ELIMINACIÓN
        //LA ELIMINACIÓN DE UN ELEMENTO DESPLAZA LOS ELEMENTOS SIGUIENTES HACIA LA IZQUIERDA( RESTA 1 A TODOS SUS
        //ÍNDICES) EXCEPTO SI ELIMINAMOS EL ÚLTIMO!!!
        //removeFirst
        //Devuelve y elimina el primer elemento pero lanza la excepción "NoSuchElementException" en caso de no encontrarlo
        System.out.println("===========================================================");
        System.out.println(arboles.removeFirst());
        //System.out.println(arboles3.removeFirst());//NoSuchElementException

        //removeLast
        //Devuelve y elimina el último elemento pero lanza la excepción "NoSuchElementException" en caso de no encontrarlo
        System.out.println("===========================================================");
        System.out.println(arboles.removeLast());

        //System.out.println(arboles3.removeLast());//NoSuchElementException

        //AÑADIMOS UNOS CUANTOS ELEMENTOS PORQUE ESTAMOS BORRANDO TODOS ;)

        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Roble", 10));
        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Nogal", 9));


        //remove
        //Devuelve y elimina el elemento especificado por el indice pero lanza la excepción "" en caso de no encontrarlo
        //Es un método sobreescrito que admite también que no le pasemos ningún argumento en cuyo caso borra el primer elemento
        System.out.println("===========================================================");
        System.out.println(arboles.remove(5));
        //System.out.println(arboles.remove(54));//IndexOutOfBoundsException
        System.out.println(arboles.remove());//Elimina el primer elemento


        //pollFirst
        //Devuelve y elimina el primer elemento o devuelve null si la lista está vacía. No lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.pollFirst());
        System.out.println(arboles3.pollFirst());//null

        //pollLast
        //Devuelve y elimina el último elemento o devuelve null si la lista está vacía. No lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.pollLast());
        System.out.println(arboles3.pollLast());//null


        //poll
        //Devuelve y elimina el primer elemento o devuelve null si la lista está vacía. No lanza ninguna excepción
        System.out.println("===========================================================");
        System.out.println(arboles.poll());//Elimina y devuelve el primer elemento
        System.out.println(arboles3.poll());//null


        //pop
        //Devuelve y elimina el primer elemento o devuelve null si la lista está vacía pero lanza la excepción NoSuchElementException
        //Es equivalente a un removeFisrt
        System.out.println("===========================================================");
        System.out.println(arboles.pop());//Elimina y devuelve el primer elemento
        //System.out.println(arboles3.pop());//NoSuchElementException


        ///////////////////////////////////////////////////////////////////////
        //Los linked list comporten el método get y otros métodos con los array list
        //get
        System.out.println("===========================================================");
        System.out.println(arboles.get(5));


        //set
        //Podemos REEMPLAZAR un elemento en la lista enbla posición que especifiquemos en el
        //argumento del métdoo
        //Devuelve y reemplaza el elemento de la posición indicada con el elemento pasado como
        //argumento. Puede lanzar varias excepciones.
        System.out.println("===========================================================");
        arboles.forEach(System.out::println);
        System.out.println("===========================================================");
        System.out.println(arboles.set(2, new Arbol("Avellano", 5)));
        //System.out.println(arboles.set(200,new Arbol("Avellano",5)));//IndexOutOfBoundsException
        System.out.println("===========================================================");
        arboles.forEach(System.out::println);

        //indexOf
        //Nos devuelve el índice del objeto pasado como argumento
        System.out.println("===========================================================");
        System.out.println(arboles.indexOf(arboles.peekFirst()));//0


    }
}
