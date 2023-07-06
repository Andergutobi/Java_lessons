package com.patxa.clase_abstracta;

public class ElfoOscuro extends Elfo {


    public String fabricarLembas() {

        return "Elfo oscuro fabricando Lembas";
    }

    @Override
    public String tirarConArco() {
        return "Elfo oscuro tirando con arco";
    }

    @Override
    public String correr() {
        return "Elfo oscuro corriendo";
    }

    @Override
    public String luchar() {
        return "Elfo oscuro luchando";
    }

    @Override
    public String cabalgar(Caballo elCaballo) {
        return "Elfo oscuro cabalgando a " + elCaballo.getNombre();
    }

    /*@Override
    public String cabalgar(Caballo elCaballo) {
        return "Elfo Oscuro cabalgando a " + elCaballo.getNombre();
    }*/


}
