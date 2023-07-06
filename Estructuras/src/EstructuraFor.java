public class EstructuraFor {

    public static void main(String[] args) {


        int i;
        for (i = 0; i <= 1000; i++) {

            System.out.println(i);
        }

        System.out.println(i);


        String[] aPersonajes = {"Orco", "Elfo", "Enano", "Humano"};

        int longitudDelArray = aPersonajes.length;//4

        for (int k = 0; k < longitudDelArray; k++) {

            System.out.println(aPersonajes[k]);

        }

    }


}
