package com.patxa.interfaces.polimorfismo;

public class Principal {

    public static void main(String[] args) {

        HospitalVeterinario hospitalVeterinarioNorte = new HospitalVeterinario(3, "Hospital Veterinario Norte");
        Pasto pastoSur = new Pasto("4353477", "Pasto Sur", true);
        Veterinario drParker = new Veterinario(3000, "Dr.Parker", 34, true, 5, 5, pastoSur, "123456");
        Pasto pastoNorte = new Pasto("435342", "Pasto Norte", true);
        Cabra juanita = new Cabra(2, "Juanita", 5, "Alpina", pastoSur);
        Operario juan = new Operario(2000, "Juan", 42, true, 5, 5, pastoSur);
        Automovil porsche911 = new Automovil(5, 8, drParker.getUbicacion(), "Porsche");
        Camion pegaso = new Camion(5, 5, juan.getUbicacion(), "Pegaso");
        Establo elEstablo = new Establo(10, "Establo Norte");

        Motosierra laMotosierra = new Motosierra(5, 5, elEstablo);
        Ordenhadora laOrdenhadora = new Ordenhadora(5, 5, elEstablo);
        juan.getMediosTransporte().add(pegaso);


        drParker.getMediosTransporte().add(porsche911);

        drParker.conducir(porsche911, hospitalVeterinarioNorte);
        System.out.println(Utilidades.dondeEsta(drParker).getNombre());


        //Motosierra motosierra1 = new Motosierra(5,5,pastoSur);
        drParker.operar(juanita, hospitalVeterinarioNorte);
        //System.out.println(Utilidades.compararUbicacion(motosierra1,juan));

        //Cargamos el camión
        pegaso.getCarga().add(juanita);
        pegaso.getCarga().add(laMotosierra);
        pegaso.getCarga().add(laOrdenhadora);

        juan.conducir(pegaso, hospitalVeterinarioNorte);

        if (pegaso.getCarga().isEmpty()) {

            System.out.println("El camión se ha vaciado en el destino");

        }

        System.out.println("La cabra Juanita está en: " + juanita.getUbicacion().getNombre());
        System.out.println("La motosierra está en: " + laMotosierra.getUbicacion().getNombre());
        System.out.println("La ordeñadora está en: " + laOrdenhadora.getUbicacion().getNombre());
        System.out.println("Juán está en: " + laOrdenhadora.getUbicacion().getNombre());
        System.out.println("El camión está en: " + pegaso.getUbicacion().getNombre());


    }
}
