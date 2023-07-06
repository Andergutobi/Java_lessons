package com.joselu.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

            /*La Interface Map (java.io.Map) en Java, nos permite representar una estructura de datos para almacenar pares "clave/valor";
        de tal manera que para una clave solamente tenemos un valor. Esta estructura de datos también es conocida en otros lenguajes de
        programación como "Diccionarios", aunque en cada lenguajes esta estructura de datos tiene sus matices, por tanto permiten añadir,
        eliminar y modificar elementos de forma trasparente para el programador..*/

       /* Otro elemento importante a la hora de trabajar con los Maps (aunque no lo es tanto como a la hora de trabajar con los ArrayList)
        son los "Iteradores" (Iterator). Los Iteradores sirven para recorrer los Map y poder trabajar con ellos. Los Iteradores solo tienen
        tres métodos que son el “hasNext()” para comprobar que siguen quedando elementos en el iterador, el“next()”  para que nos de el siguiente
        elemento del iterador; y el “remove()” que sirve para eliminar el elemento del Iterador. En realidad se puede prescindir de los
        iteradores para trabajar con los Map ya que la gran ventaja de los Map frente a los ArrayList, es que estos tienen una clave asociada al objeto
        y se les puede buscar por la clave, aunque nunca esta de más saber utilizar los iteradores para manejar los Map.*/

        /*Tenemos tres tipos de Map

        1 - HashMap: Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.
        2 - TreeMap: El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros (como luego veremos), los ordena de menos a mayor.
        3 - LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando; es decir, que no tiene una ordenación de los elementos como tal,
        por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases.*/

        /*En Java, Map es una interfaz utilizada para almacenar datos en un par clave-valor, mientras que HashMap es la clase de implementación de la interfaz Map.*/

        /*Es importante el uso de la referencia Map mientras se trabaja con sus clases de implementación. Por ejemplo si  tenemos un método que toma un objeto
        Map como argumento. Entonces, en el momento de la llamada, podemos pasar el objeto de cualquier clase como HashMap o HashTable.*/

        //Un HashMap básicamente designa claves únicaspara los valores correspondientes que se pueden recuperar en cualquier punto dado.

        /*Características de Java Hashmap
        a) Los valores se pueden almacenar en un mapa formando un par clave-valor. El valor se puede recuperar usando la clave pasándola al método correcto.
        b) Si no existe ningún elemento en el Mapa, arrojará una ‘ NoSuchElementException’ .
        c) HashMap almacena solo  referencias de objetos . Por eso, es imposible utilizar tipos de datos primitivos como double o int. Utilice la
        clase contenedora (como Integer o Double) en su lugar.
        */

        /*Un HashMap almacena elementos en pares "clave/valor", y se puede acceder a ellos mediante un índice de otro tipo (por ejemplo, una cadena).
        Un objeto se utiliza como clave (índice o key) de otro objeto (valor). Puede almacenar diferentes tipos: Claves de String y valores de Integer,
        o el mismo tipo, como Claves de cadena y valores de cadena:*/

        //El valor puede repetirse pero la llave Key debe ser única

        /*La interfaz Map por sí sola no se puede utilizar para almacenar datos, pero podemos
        crear un objeto de sus clases de implementación y luego usar la referencia Map para
        contener el objeto. Aquí, usamos la clase HashMap para almacenar datos y la interfaz
        Map para contener la referencia de esta clase. Vea el ejemplo a continuación.*/

        Map<Integer, String> jugadores = new HashMap<>();

        jugadores.put(1, "Casillas");
        jugadores.put(2, "Ramos");
        jugadores.put(3, "Piqué");
        jugadores.put(4, "Puyol");
        jugadores.put(5, "Xabi Alonso");
        jugadores.put(6, "Iniesta");
        jugadores.put(7, "Villa");
        //jugadores.put(7,"Iribar");

        //containsValue
        System.out.println("Está Busquets como valor?: " + jugadores.containsValue("Busquets"));//false
        System.out.println("Está Iniesta como valor?: " + jugadores.containsValue("Iniesta"));//true

        //containsKey
        System.out.println("Está la key 16?: " + jugadores.containsKey(16));//false
        System.out.println("Está la key 1?: " + jugadores.containsKey(1));//true


        //values
        //CONSEGUIR VALUES
        Collection<String> jugadoresCollection = jugadores.values();
        jugadoresCollection.forEach(System.out::println);

        //remove
        System.out.println("El jugador eliminado ha sido: " + jugadores.remove(3));//Piqué
        //el método remove está sobrecargado
        System.out.println("El jugador eliminado ha sido: " + jugadores.remove(1, "Casillas"));//true
        //No existe la sobrecarga pasando solo el value porque podemos tener varios elementos con el mismo value

        //size
        System.out.println("El tamaño de la colección es: " + jugadores.size());

        //keyset
        //Deevuelve todos los keys que hay en un map dentro de un set
        Set<Integer> dorsales = jugadores.keySet();
        dorsales.forEach(System.out::println);

        //isEmpty
        System.out.println("¿EStá vacío?: " + jugadores.isEmpty());

        //replace
        //Pasamos como primer arguemnto el Key, si encuentra concurrencia, modifica el value con el value
        // pasado como segundo argumento y devuelve el value anterior
        //En el caso de que no haya concurrencia devuelve null y lógicamente no hace ningún cambio
        System.out.println("El jugador reemplazado es; " + jugadores.replace(7, "Toquero"));//Villa
        System.out.println("El jugador reemplazado es; " + jugadores.replace(17, "Messi"));//null
        System.out.println("El jugador reemplazado es; " + jugadores.replace(5, "Xabi Alonso", "Ronaldo"));//true

        System.out.println("===================================================================");
        //iterar un key-value de un Map
        //FORMA TRADICIONAL
        for (Integer dorsal : jugadores.keySet()) {
            System.out.println("dorsal: " + dorsal + " - nombre: " + jugadores.get(dorsal));
        }

        System.out.println("===================================================================");
        //FORMA PROGRAMACIÓN FUNCIONAL
        jugadores.forEach((k, v) -> System.out.println("dorsal: " + k + " - nombre: " + v));

        //clear
        //Limpia completamente el map de contenido
        jugadores.clear();
        System.out.println("¿Está el map vacío?: " + jugadores.isEmpty());

        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        ////////TODOS LOS MÉTODOS SON COMUNES A LOS MAP (LINKEDHASHMAP, TREEMAP, HASHMAP)/////////
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////


    }


}
