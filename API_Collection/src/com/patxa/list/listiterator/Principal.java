package com.joselu.list.listiterator;

import com.joselu.list.models.Arbol;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        //ITERATOR: SIRVEN PARA COLLECTION: LIST Y SETS
        //LISTITERATOR: SIRVEN SOLO PARA LOS LIST

        //1) CON ITERATOR SOLO PODEMOS MOVERNOS HACIA ADELANTE. CON LIST ITERATOR HACIA ADELANTE Y HACIA ATRÁS...
        //2) CON LISTITERATOR PODEMOS OBTENER EL ÍNDICE EN CUALQUIER PUNTO MIENTRAS RECORREMOS EL LIST. ESTO NO ES POSIBLE CON ITERATOR
        //3) CON ITERATOR SOLO PODEMOS COMPROBAR SI EL SIGUIENTE ELEMENTO ESTÁ DISPONIBLE O NO. CON LISTITERATOR PODEMOS COMPROBAR ELEMENTOS ANTERIORES Y SIGUIENTES
        //4) CON LISTITERATOR PODEMOS AÑADIR UN ELEMENTO EN CUALQUIER PUNTO MIENTRAS SE RECORRE. CON ITERATOR ESTO NO ES POSIBLE
        //5) CON LISTITERATOR PODEMOS BORRAR UN ELEMENTO EN CUALQUIER PUNTO MIENTRAS SE RECORRE. CON ITERATOR ESTO NO ES POSIBLE

        List<Arbol> arboles = new ArrayList<>();

        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Roble", 10));
        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Nogal", 9));
        arboles.add(new Arbol("Nogal", 11));
        arboles.add(new Arbol("Cerezo", 6));
        arboles.add(new Arbol("Cerezo", 8));
        arboles.add(new Arbol("Almendro", 3));
        arboles.add(new Arbol("Limonero", 6));

        //Vamos a crear un iterador para el array list arboles y de es esta manera conseguimos crear un "pointer"
        ListIterator<Arbol> iteradorArbol = arboles.listIterator();

        //Ahora podemos recorrer la lista en todas las direcciones
        //desplazando el pointer con los métodos que nos proporciona un list iterator

        System.out.println("El siguiente índice INICIO: " + iteradorArbol.nextIndex());

        System.out.println(iteradorArbol.hasPrevious() ? "Tiene un elemento previo" : "No tiene un elemento previo");//FALSE

        System.out.println(iteradorArbol.hasNext() ? "Tiene un elemento posterior" : "No tiene un elemento posterior");//TRUE

        System.out.println("=================================================================");
        while (iteradorArbol.hasNext()) {

            Arbol miArbol = iteradorArbol.next();
            System.out.println(miArbol);

        }

        System.out.println(iteradorArbol.hasPrevious() ? "Tiene un elemento previo" : "No tiene un elemento previo");//TRUE

        System.out.println(iteradorArbol.hasNext() ? "Tiene un elemento posterior" : "No tiene un elemento posterior");//FALSE

        System.out.println("=================================================================");
        while (iteradorArbol.hasPrevious()) {

            Arbol miArbol = iteradorArbol.previous();
            System.out.println(miArbol);

        }


        System.out.println("El siguiente índice es el: " + iteradorArbol.nextIndex());//Nos informa sobre el siguiente index (no lo mueve)

        System.out.println("Nos movemos un elemento hacia adelante: " + iteradorArbol.next().getNombre());//Nos movemos un elemento hacia adelante
        System.out.println("Nos movemos un elemento hacia adelante: " + iteradorArbol.next().getNombre());//Nos movemos un elemento hacia adelante

        System.out.println("Nos movemos un elemento hacia atrás: " + iteradorArbol.previous().getNombre());//Nos movemos un elemento hacia atrás
        System.out.println("Nos movemos un elemento hacia atrás: " + iteradorArbol.previous().getNombre());//Nos movemos un elemento hacia atrás

        //Devuelve -1 en el caso de que no exista
        System.out.println("El índice anterior es el: " + iteradorArbol.previousIndex());//Nos informa sobre el indice anterior (no lo mueve)


        //Si eliminamos los elementos de la lista sigue funcionando el list iterator?
        arboles.clear();

        arboles.add(new Arbol("Nogal", 11));
        arboles.add(new Arbol("Cerezo", 6));
        arboles.add(new Arbol("Cerezo", 8));


        System.out.println("Cual es indice siguiente?: " + iteradorArbol.nextIndex());
        //iteradorArbol.next();//ConcurrentModificationException

        //Respuesta: no. El iteradorArbol no se actualiza pero conserva la posición anterior
        //TENEMOS QUE CREAR UN NUEVO LIST ITERATOR

        iteradorArbol = arboles.listIterator();

        System.out.println("=================================================================");

        arboles.forEach(System.out::println);

        //Sustituimos un elemento:
        iteradorArbol.next();//Es importante hacer un next o un previous antes de hacer un set
        iteradorArbol.set(new Arbol("Mandarino", 3));

        System.out.println("=================================================================");
        arboles.forEach(System.out::println);


        //PREGUNTAR DONDE ESTA EL POINTER
        System.out.println("El siguiente índice es el POINTER: " + iteradorArbol.nextIndex());
        iteradorArbol.next();
        System.out.println("El siguiente índice es el POINTER2: " + iteradorArbol.nextIndex());

        //Eliminar un elemento
        iteradorArbol.remove();//Elimina el mandarino
        //PREGUNTAR DONDE ESTA EL POINTER
        System.out.println("El siguiente índice es el POINTER3: " + iteradorArbol.nextIndex());
        //HEMOS COMPROBADO QUE EL CURSOR DEL ITERADOR RETROCEDE UNA POSICIÓN CUANDO ELIMINAMOS UN ELEMENTO
        System.out.println("=================================================================");
        arboles.forEach(System.out::println);

        iteradorArbol.next();

        //Añadir un elemento
        iteradorArbol.add(new Arbol("Mandarino", 7));
        System.out.println("=================================================================");
        arboles.forEach(System.out::println);
        //HEMOS COMPROBADO QUE EL CURSOR DEL ITERADOR ADELANTA UNA POSICIÓN CUANDO AÑADIMOS UN ELEMENTO
        System.out.println("El siguiente índice es el POINTER4: " + iteradorArbol.nextIndex());


    }
}
