public class OperadoresLogicos {

    public static void main(String[] args) {


        //LOS OPERADORES LÓGICOS EVALÚAN UNA EXPRESIÓN EN LA QUE PUEDEN ESTAR IMPLICADOS
        //VARIOS OPERANDOS Y RETORNAN COMO RESULTADO UN VALOR BOOLEANO

        int i = 3;
        int j = 5;

        //OPERADOR &&
        boolean resultado = (i > 0) && (j == 1); //TRUE && FALSE ==> FALSE
        System.out.println("resultado = " + resultado);


        //OPERADOR ||
        boolean resultado2 = (i == 3) || (j == 8);//TRUE || FALSE ==> TRUE
        System.out.println("resultado2 = " + resultado2);

        //OPERADOR TERNARIO
        //imaginemos que nos llega de una BBDD el stock de pantalones de un determinado modelo
        int stock = 2;

        String resultado3 = (stock > 0) ? "Hay pantalones" : "No quedan pantalones en stock";
        System.out.println("resultado3 = " + resultado3);


    }


}
