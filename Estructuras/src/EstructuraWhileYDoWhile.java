public class EstructuraWhileYDoWhile {

    public static void main(String[] args) {

        int i = 0;

        /*while(i!=0){

            System.out.println("He entrado en el bucle while");
        }*/


        /*do{

            System.out.println("He entrado en el bucle do while");

        }while(i!=0);*/

        //Listar por consola del 0 al 100
        while (i <= 100) {

            System.out.println(i);
            //Dentro de un while es importante modificar le valor de la condición porque de lo contrario entraríamos en un bucle infinito.
            i++;

        }

        System.out.println("==========================================================");
        System.out.println("==========================================================");
        System.out.println("==========================================================");

        int c = 200;

        do {
            System.out.println(c);
            c++;

        } while (c < 20);

        System.out.println("c = " + c);


    }
}
