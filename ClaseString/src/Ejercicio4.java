public class Ejercicio4 {

    public static void main(String[] args) {

        //Divide la cadena de texto "Rubber Soul" en dos partes "Rubber" y "Soul"
        //Posteriormente las volvemos a concatenenar con el método concat

        String miTexto = "Rubber Soul";

        String parte1 = miTexto.substring(0, 6);//El primer argumento es inclusive y el segundo es exclusive
        String parte2 = miTexto.substring(6);
        System.out.println(parte1);
        System.out.println(parte2);

        System.out.println(parte1.concat(parte2));

        String[] misPalabras = miTexto.split(" ");


        for (String palabra : misPalabras) {

            System.out.println(palabra);

        }

    }
}
