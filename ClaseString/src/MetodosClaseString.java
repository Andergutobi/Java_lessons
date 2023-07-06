public class MetodosClaseString {

    public static void main(String[] args) {


        String miVariableString = "ABRACADABRA";
        String elQuijote = "En un lugar de la Mancha";

        //Método lenght
        int nCaracteres = elQuijote.length();

        //Método toUpperCase
        String textoMayusculas = elQuijote.toUpperCase();

        //Método toLowerCase
        String textoMinusculas = elQuijote.toLowerCase();

        //Método CharAt
        char elCaracter = elQuijote.charAt(4);

        //Método substring
        String miSubcadena = elQuijote.substring(3, 5);//El primer parámetro es inclusivo. El segundo exclusivo

        //Método concat
        String cadenasConcatenadas = miVariableString.concat(elQuijote);

        //Método endsWith
        String miArchivo = "archivo.png";
        boolean esPNG = miArchivo.endsWith(".png");


    }
}
