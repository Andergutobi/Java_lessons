package com.patxa.mundo_tolkien;

public enum Rol {
    HUMANO("Humano"),
    ELFO("Elfo"),
    ORCO("Orco"),
    HOBBIT("Hobbit");

    ///////////////////////////////
    private String rol;
    /////////////////////////////////


    Rol(String rol) {
        this.rol = rol;
    }

    ////////////////////////////////


    public String getRol() {
        return rol;
    }

    //////////////////////////////////


    @Override
    public String toString() {
        return "Rol{" +
                "rol='" + rol + '\'' +
                "} " + super.toString();
    }


}
