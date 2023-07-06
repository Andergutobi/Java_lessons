public class CreacionObjetosString {

    public static void main(String[] args) {


        String miString = "Los Hobbits";
        String miString2 = new String(" desayunan dos veces");
        String miString3 = " abundantemente";

        String resultado = miString + miString2;
        System.out.println("resultado = " + resultado);

        StringBuilder miSB = new StringBuilder(miString);

        System.out.println(miSB.append(miString2).append(miString3).reverse());


    }
}
