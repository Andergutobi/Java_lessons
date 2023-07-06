package com.joselu.set.treeset_clasespropias;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {


        Set<Elfo> elfos = new TreeSet<>();

        Elfo irwee = new Elfo("Irwee", 432);
        Elfo elrond = new Elfo("Elrond", 678);
        Elfo airwin = new Elfo("Airwin", 89);
        Elfo oswald = new Elfo("Oswald", 89);


        elfos.add(irwee);
        elfos.add(elrond);
        elfos.add(airwin);
        elfos.add(oswald);


        System.out.println("========================================================");
        elfos.forEach(System.out::println);


        //Con la clase Orco vamos a intentar establecer el criterio de comparación
        //mediante compareTo pero de otra forma (cabe destacar que la clase Orco
        //no tiene implementada la interfaz comparable

        //Set<Orco> orcos = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()) );
        Set<Orco> orcos = new TreeSet<>(Comparator.comparing(Orco::getNombre));


        //NO HA HECHO FALTA IMPLEMENTAR COMPARABLE SI UTILIZAMOS COMPARATOR CORRECTAMENTE
        //EN EL CONSTRUCTOR DEL TREESET
        Orco grumfg = new Orco("Grumfg");
        Orco zark = new Orco("Zark");
        Orco amp = new Orco("Amp");

        orcos.add(grumfg);
        orcos.add(zark);
        orcos.add(amp);

        System.out.println("========================================================");
        orcos.forEach(System.out::println);


    }
}
