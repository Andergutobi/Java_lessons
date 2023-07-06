package com.patxa.clase_abstracta;

public class Orco extends Humanoide {


    public String robarGallinas() {

        return "Orco robando gallinas";

    }

    @Override
    public String correr() {
        return "orco corriendo";
    }

    @Override
    public String luchar() {
        return "orco luchando";
    }

    @Override
    public String cabalgar(Caballo elCaballo) {
        return "orco cabalgando a " + elCaballo.getNombre();
    }
}
