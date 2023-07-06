package com.patxa.cuenta_corriente;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {


        CuentaCorriente banco = new CuentaCorriente("ES666", 1000000.0, "Banco Pufing", "SA", true);
        CuentaCorriente ccPepito = new CuentaCorriente("ES7659876765", 567.0, "Pepito", "Ridruejo", false);
        CuentaCorriente ccJuanito = new CuentaCorriente("ES9875223434", 123.0, "Juanito", "de Borbón", false);
        CuentaCorriente ccFroilan = new CuentaCorriente("RD1111111111", 1000.0, "Froilan", "de Borbón", true);


        //Introducimos unas cuentas corrientes
        Database.getCuentasCorrientes().add(ccPepito);
        Database.getCuentasCorrientes().add(ccJuanito);
        Database.getCuentasCorrientes().add(banco);
        Database.getCuentasCorrientes().add(ccFroilan);


        try {

            String[] opciones = new String[Database.getCuentasCorrientes().size()];

            for (int i = 0; i < Database.getCuentasCorrientes().size(); i++) {

                opciones[i] = Database.getCuentasCorrientes().get(i).getnCuenta();

            }


            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Qué cantidad deseas transferir?"));


            //Petición de datos mediante botones
            //int origen =  Mensaje.peticionDatosTransferencia(opciones,"Elige cc origen");
            //int destino =  Mensaje.peticionDatosTransferencia(opciones,"Elige cc destino");
            //Banco.transferir(Database.getCuentasCorrientes().get(origen),Database.getCuentasCorrientes().get(destino),cantidad);


            //Petición de datos mediante Input Dialog
            String origen = Mensaje.peticionDatosTransferenciaManual("Elige cc origen");
            String destino = Mensaje.peticionDatosTransferenciaManual("Elige cc destino");

            CuentaCorriente ccOrigen = null;
            CuentaCorriente ccDestino = null;

            for (CuentaCorriente laCC : Database.getCuentasCorrientes()) {


                if (laCC.getnCuenta().equals(origen)) {

                    ccOrigen = laCC;
                }


                if (laCC.getnCuenta().equals(destino)) {

                    ccDestino = laCC;
                }

            }


            //Petición de datos mediante Input Dialogcc
            Banco.transferir(ccOrigen, ccDestino, cantidad);


        } catch (CCInexistenteException e) {
            e.printStackTrace();
            Mensaje.mensajeError(e.getMessage());
        }


    }
}
