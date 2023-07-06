package com.patxa.cuenta_corriente;

import javax.swing.*;

public class Mensaje {


    public static void mensajeSimple(String msg) {

        JOptionPane.showMessageDialog(null, msg);

    }

    public static void mensajeError(String msg) {

        JOptionPane.showMessageDialog(null, msg, "error", 2);
    }


    public static int peticionDatosTransferencia(String[] opciones, String titulo) {

        return JOptionPane.showOptionDialog(null,
                "",
                titulo,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                null

        );

    }


    public static String peticionDatosTransferenciaManual(String titulo) {

        return JOptionPane.showInputDialog(titulo);

    }


}
