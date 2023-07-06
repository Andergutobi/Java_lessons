package com.patxa.mundo_tolkien;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Panel {

    private static final ArrayList<String> opcionPrincipalGeneral = new ArrayList<>();//1
    private static final ArrayList<String> opcionCategoriaComerciales = new ArrayList<>();//2
    private static final ArrayList<String> opcionCategoriaArmas = new ArrayList<>();//3
    private static final ArrayList<String> opcionCategoriaMercaderias = new ArrayList<>();//4
    private static final ArrayList<String> opcionCategoriaMediosTransporte = new ArrayList<>();//5
    private static final ArrayList<String> opcionCategoriaConstrucciones = new ArrayList<>();//6


    //////////////////////////////////////////////////////////////////

    public Panel() {


    }

    //////////////////////////////////////////////////////////////////

    public static void rellenoArrayList() {

        //1
        opcionPrincipalGeneral.add("Comprar");
        opcionPrincipalGeneral.add("Vender");
        opcionPrincipalGeneral.add("Robar");
        opcionPrincipalGeneral.add("Viajar");
        opcionPrincipalGeneral.add("SALIR DEL JUEGO");
        opcionPrincipalGeneral.add("INVENTARIO");

        //2
        opcionCategoriaComerciales.add("Armas");
        opcionCategoriaComerciales.add("Mercaderías");
        opcionCategoriaComerciales.add("Medios de Transporte");
        opcionCategoriaComerciales.add("Construcciones");
        opcionCategoriaComerciales.add("IR ATRÁS");

        //3
        opcionCategoriaArmas.add("Espada");
        opcionCategoriaArmas.add("Arco");
        opcionCategoriaArmas.add("IR ATRÁS");

        //4
        opcionCategoriaMercaderias.add("Barril de Cereales");
        opcionCategoriaMercaderias.add("Barril de Pólvora");
        opcionCategoriaMercaderias.add("IR ATRÁS");

        //5
        opcionCategoriaMediosTransporte.add("Barco");
        opcionCategoriaMediosTransporte.add("IR ATRÁS");

        //6
        opcionCategoriaConstrucciones.add("Casa");
        opcionCategoriaConstrucciones.add("IR ATRÁS");


    }

    private static String[] opcionesPropuestas(Integer s) {

        //Creamos un array list auxiliar...
        ArrayList<String> opciones = null;


        switch (s) {

            case 1:

                opciones = opcionPrincipalGeneral;
                break;

            case 2:
                opciones = opcionCategoriaComerciales;
                break;

            case 3:
                opciones = opcionCategoriaArmas;
                break;

            case 4:
                opciones = opcionCategoriaMercaderias;
                break;

            case 5:
                opciones = opcionCategoriaMediosTransporte;
                break;

            case 6:
                opciones = opcionCategoriaConstrucciones;
                break;

        }

        //Aquí devolvemos un array que obtenemos del arraylist
        //Vamos a ver las formas que nos da Java para pasar de un ArrayList a un Array
        //1)Utilizando un método Object[] toArray()
        /*Object[] objects = opciones.toArray();
        String[] miArrayString = (String[]) objects;//Hacemos un casteo a String
        return miArrayString;*/

        //2)
        /*String[] miArrayString = new String[opciones.size()];
        System.out.println(opciones.size());
        return opciones.toArray(miArrayString);*/


        //3)Forma manual con un for
        /*String[] miArrayString = new String[opciones.size()];
        for(int i = 0; i<opciones.size();i++){

            miArrayString[i] = opciones.get(i);
        }

        return miArrayString;*/


        //4)Mediante api stream
        String[] miArrayString = opciones.stream().map(String::toString).toArray(String[]::new);
        return miArrayString;


    }


    //Este método es el que realmente hace aparecer el panel de opciones devolviendonos un int con la opcioón elegida
    public static int panelOpciones(Integer n) {

        String[] opciones = opcionesPropuestas(n);


        return JOptionPane.showOptionDialog(null,
                "",
                "Elige qué hacer",
                JOptionPane.YES_NO_CANCEL_OPTION,//por defecto 1
                JOptionPane.PLAIN_MESSAGE,//-1
                null,
                opciones,
                null

        );

    }


    public static IComerciable panelOpciones(ArrayList<IComerciable> o) {

        String[] opciones = new String[o.size()];
        for (int i = 0; i < o.size(); i++) {

            opciones[i] = o.get(i).getContenido() + " " + o.get(i).getPrecio() + " dinares";
        }
        //opciones = o.toArray(opciones);

        int itemElegido = JOptionPane.showOptionDialog(null,
                "",
                "Elige un producto",
                JOptionPane.YES_NO_CANCEL_OPTION,//por defecto 1
                JOptionPane.PLAIN_MESSAGE,//-1
                null,
                opciones,
                null

        );

        return o.get(itemElegido);

    }


    public static void mensajeSimple(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);
    }


    public static void inventario(Personaje yo) {

        List<List<? extends IComerciable>> inventario = yo.getInventarioGeneral();
        StringBuilder inventarioTexto = new StringBuilder("======================================================\n");

        for (List<? extends IComerciable> laLista : inventario) {

            //System.out.println(laLista);
            for (IComerciable item : laLista) {


                inventarioTexto.append(item.getContenido()).append("\n").append(item.getPrecio()).append("\n").append(item.getCalidad().getCalidad()).append("\n").append(item.getMaterial().getMaterial()).append("\n").append("======================================================\n");


            }


        }


        inventarioTexto.append(yo.getDinero()).append(" dinares").append("\n").append("======================================================\n");
        JOptionPane.showMessageDialog(null, inventarioTexto);

    }


}
