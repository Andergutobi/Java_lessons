package com.patxa.enumeradores;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        Automovil automovil1 = new Automovil("Testarossa", ColorAutomovil.ROJO, Fabricante.FERRARI, TipoAutomovil.COUPE);
        Automovil automovil2 = new Automovil("Clio", ColorAutomovil.AMARILLO, Fabricante.RENAULT, TipoAutomovil.SEDAN);

        //Fabricante del automovil
        System.out.println(automovil1.getFabricante().getPais());

        ArrayList<Automovil> concesionarioAlgorta = new ArrayList<>();

        ArrayList<String> coloresAutos = new ArrayList<>();

        concesionarioAlgorta.add(automovil1);
        concesionarioAlgorta.add(automovil2);

        for (Automovil automovil : concesionarioAlgorta) {

            System.out.println(automovil.getFabricante().getNombre() + " " + automovil.getFabricante().getPais());

        }


        //MÉTODOS MAS UTILIZADOS CON LOS ENUMERADORES

        //Forma de "instanciarse" un objeto de un enumerador

        Fabricante miFabricante = Fabricante.SEAT;
        ColorAutomovil miColor = ColorAutomovil.GRIS;
        TipoAutomovil miTipoAutomovil = TipoAutomovil.SEDAN;

        Automovil automovil3 = new Automovil("Panda", miColor, miFabricante, miTipoAutomovil);

        concesionarioAlgorta.add(automovil3);

        //name()
        //Devuelve un String con el nombre de la constante
        System.out.println(miFabricante.name());//SEAT
        System.out.println(miColor.name());//GRIS
        System.out.println(miTipoAutomovil.name());//SEDAN

        //toString()
        System.out.println(miTipoAutomovil.toString());//Devuelve un String con el nombre de la constante: SEDAN

        //values()
        ColorAutomovil[] losObjetosDelEnumeradorColorAutomovil = ColorAutomovil.values();

        for (ColorAutomovil elObjeto : losObjetosDelEnumeradorColorAutomovil) {

            System.out.println(elObjeto.name());//Listado de constantes
            System.out.println(elObjeto.getColor());//Listado de colores
            //Crear un array List y meter en él el listado de colores
            coloresAutos.add(elObjeto.getColor());
        }

        for (String elColor : coloresAutos) {

            System.out.println(elColor);

        }


        for (Automovil elAuto : concesionarioAlgorta) {


            System.out.println(elAuto);


        }


        //Sacar por consola los meses del año en Inglés
        MesesAnyo[] losObjetosDelEnumeradorMesesAnyo = MesesAnyo.values();

        for (MesesAnyo mes : losObjetosDelEnumeradorMesesAnyo) {

            System.out.println(mes.getNombreIngles());

        }

        //ordinal()
        System.out.println(miColor.ordinal());//Devuelve un entero según la posición en la que esté declarado en el enumerador. Empieza por 0


    }
}
