package com.patxa.cuenta_corriente;

import java.util.ArrayList;

public class Database {

    //Esta clase va a simular la llamada a una BBDD. Se da por hecho que esto es un ejemplo didáctico

    private static ArrayList<CuentaCorriente> cuentasCorrientes = new ArrayList<>();


    ////////////////////////////////////////////////////


    public static ArrayList<CuentaCorriente> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    /////////////////////////////////////////////////////

    //Simulamos el método find
    public static boolean find(CuentaCorriente cc) {

        return cuentasCorrientes.contains(cc);

    }

    //Este método se encarga de efectuar los movimientos de saldos entre varias cuentas
    public static void movimiento(CuentaCorriente origen, CuentaCorriente destino, Double cantidad) {


        //Cuando llegamos a este punto ya está comprobado que la trensferencia se puede efectuar sin problema
        origen.setSaldo(origen.getSaldo() - cantidad - origen.getComision());
        destino.setSaldo(destino.getSaldo() + cantidad);


        //Aquí añadimos a la cuenta del Bado su beneficio
        for (CuentaCorriente cc : cuentasCorrientes) {

            if (cc.getnCuenta().equals("ES666")) {

                cc.setSaldo(cc.getSaldo() + origen.getComision());
                Mensaje.mensajeSimple("El saldo final de " + cc.getNombre() + " es de " + cc.getSaldo() + "€");
            }
        }


        Mensaje.mensajeSimple("El saldo final de " + origen.getNombre() + " es de " + origen.getSaldo() + "€");
        Mensaje.mensajeSimple("El saldo final de " + destino.getNombre() + " es de " + destino.getSaldo() + "€");


    }


}
