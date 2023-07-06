public class Principal {

    public static void main(String[] args) {


        Perro dientitos = new Perro("masculino", "Dientitos", 5, "Rotweiller", "negro", 5, 100);
        Perro fifi = new Perro("femenino", "Fifí", 4, "Chihuahua", "canela", 5, 150);
        Perro canelo = new Perro("masculino", "Canelo", 7, "Setter", "canela", 5, 50);

        Perro fifi2 = fifi;


        System.out.println(dientitos.correr());

        System.out.println(dientitos.getNombre());

        dientitos.setEdad(6);

        System.out.println("elPerro = " + dientitos);


        System.out.println(dientitos.ladrar(0));
        System.out.println(fifi.ladrar(6));

        System.out.println(dientitos.jugarConPerro(fifi));
        System.out.println(fifi.jugarConPerro(dientitos));
        System.out.println(fifi.jugarConPerro(canelo));

        System.out.println(fifi);
        System.out.println(fifi2);

        Humano pepito = new Humano("Pepito", 5, 1000);

        System.out.println(pepito.jugarConPerro(fifi));

        //"salta!" "corre!"
        pepito.darOrdenPerro(dientitos, "salta!");

        //adopto un perro
        pepito.adoptarPerro(canelo);
        pepito.adoptarPerro(dientitos);


    }

}

