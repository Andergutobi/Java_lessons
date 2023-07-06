public class InmutabilidadObjetosString {

    public static void main(String[] args) {

        String parrafo = "Los Orcos";
        String parrafo2 = parrafo;

        System.out.println("El identityHashCode de parrafo es: " + System.identityHashCode(parrafo));
        System.out.println("El identityHashCode de parrafo2 es: " + System.identityHashCode(parrafo2));

        parrafo2 = "Los orcos son muy malos";

        System.out.println(parrafo);

        System.out.println("El identityHashCode de parrafo es: " + System.identityHashCode(parrafo));
        System.out.println("El identityHashCode de parrafo2 es: " + System.identityHashCode(parrafo2));

        /*int[] miArray={3,4,5};
        int[] miArray2=miArray;

        miArray2[0]=10;

        System.out.println(miArray[0]);*/


    }
}
