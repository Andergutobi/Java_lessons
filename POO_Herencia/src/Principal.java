public class Principal {

    public static void main(String[] args) {

        Perro toby = new Perro(true, 6, "la casa", "marrón", "Toby", "Rotweiller", 5);
        Humano pepito = new Humano("homo sapiens", false, 45, "bar", "calvo", "Pepito");

        Pato lucas = new Pato();

        System.out.println("toby = " + toby);
        System.out.println(pepito);


        System.out.println(toby.emitirSonido());
        System.out.println(lucas.emitirSonido());


    }
}
