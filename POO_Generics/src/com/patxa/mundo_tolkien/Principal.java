package com.patxa.mundo_tolkien;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        //Rellenamos los array list de panel
        Panel.rellenoArrayList();//Los Fijos

        ArrayList<IComerciable> mercadoEspadas = new ArrayList<>();
        Personaje yo = new Personaje(Ciudades.GONDOR, Profesion.COMERCIANTE, Rol.HUMANO, "Elrond");

        //CREAMOS OBJETOS PARA INTERACTUAR CON ELLOS
        mercadoEspadas.add(new Espada(Ciudades.GONDOR, 200.0, Calidad.BUENA, Material.ACERO, "Espada Excalibur", 5, "Espada Excalibur"));
        mercadoEspadas.add(new Espada(Ciudades.GONDOR, 300.0, Calidad.EXCELENTE, Material.ACEROELFICO, "Espada Tizona", 5, "Espada Tizona"));
        //FIN CREAR OBJETOS PARA INTERACTUAR CON ELLOS

        boolean salir = false;


        //Aquí empieza la dinamica del juego...
        do {

            int option = Panel.panelOpciones(1);

            switch (option) {
                case 0://MENU COMPRAR

                    int option2 = Panel.panelOpciones(2);

                    switch (option2) {//MENU COMPRAR - ARMAS
                        case 0:
                            int option2A = Panel.panelOpciones(3);//ARMAS
                            switch (option2A) {
                                case 0:
                                    IComerciable elObjetoElegido = Panel.panelOpciones(mercadoEspadas);
                                    yo.comprar(elObjetoElegido, mercadoEspadas);
                                    break;
                                case 1:
                                    break;
                            }
                            break;
                        case 1:
                            int option2B = Panel.panelOpciones(4); //MERCADERIAS
                            break;
                        case 2:
                            int option2C = Panel.panelOpciones(5); //MEDIOS DE TRANSPORTE
                            break;
                        case 3:
                            int option2D = Panel.panelOpciones(6); //CONSTRUCCIONES
                            break;
                        case 4:
                            break;


                    }

                    break;

                case 1:
                    //llamo a vender
                    break;
                case 2:
                    //llamo a robar
                    break;
                case 3:
                    //llamo a viajar
                    break;
                case 4:
                    salir = true;//Salir del programa
                    break;

                case 5:
                    Panel.inventario(yo);


            }


        } while (!salir);


    }
}
