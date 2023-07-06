public class Principal {

    public static void main(String[] args) {

        Gato mizifuz = new Gato(2, "Mizufuz");

        Gato zafiron = new Gato("Zafirón");

        System.out.println(zafiron.maullar());

        System.out.println(mizifuz.maullar(4, "miau"));

        System.out.println(mizifuz.maullar("meaouwwww"));

        /*Gato gato1 = new Gato(2, "Pepito");
        Gato gato2 = new Gato(2, "Pepito");

        System.out.println("gato1 = " + gato1);
        System.out.println("gato2 = " + gato2);

        String resultado = gato1.equals(gato2) ? "Son iguales" : "Son diferentes";
        System.out.println("resultado = " + resultado);*/

    }
}
