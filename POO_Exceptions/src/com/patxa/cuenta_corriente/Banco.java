package com.patxa.cuenta_corriente;

public class Banco {

    public static void transferir(CuentaCorriente origen, CuentaCorriente destino, Double cantidad) throws CCInexistenteException {

        if (!Database.find(origen)) {

            throw new CCInexistenteException("No existe la Cuenta Corriente de origen");

        }

        if (!Database.find(destino)) {

            throw new CCInexistenteException("No existe la Cuenta Corriente de destino");

        }


        if (origen.isPremium() || (origen.getSaldo() >= (cantidad + origen.getComision()))) {

            Database.movimiento(origen, destino, cantidad);

        } else {

            Mensaje.mensajeSimple("No hay suficiente saldo para efectuar la operación");

        }

    }


}


