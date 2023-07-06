public class Ejercicio1 {

    public static void main(String[] args) {

        //Deletrea el String "Athletic Club" mostrándolo en pantalla caracter por caracter

        String texto = "Athletic Club";

        //Hay un método de los Strings que pasa un String a un array de caracteres toCharArray()

        char[] miArray = texto.toCharArray();

        for (char miCaracter : miArray) {

            System.out.println(miCaracter);
        }


    }
}
