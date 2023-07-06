package com.patxa.excepciones2;

import javax.swing.*;

public class Principal {

    private static double dividendo;
    private static double divisor;
    private static double division;

    public static void main(String[] args) {
        //NumberFormatException

        try {
            pideDatosUsuario();
            division = Calculadora.dividir(dividendo, divisor);
        } catch (DivisionCeroException e) {
            e.printStackTrace();
        }

        System.out.println("El programa seguiría aquí");


    }


    public static void pideDatosUsuario() {

        dividendo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo"));
        divisor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor"));

    }


}
