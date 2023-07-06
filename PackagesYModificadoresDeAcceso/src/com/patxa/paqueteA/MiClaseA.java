package com.patxa.paqueteA;

public class MiClaseA {

    public String miAtributoPublico;
    protected String miAtributoProtegido;
    String miAtributoDefault;
    private String miAtributoPrivado;

    ///////////////////////////////////////////


    public MiClaseA(String miAtributoPrivado, String miAtributoPublico, String miAtributoProtegido, String miAtributoDefault) {
        this.miAtributoPrivado = miAtributoPrivado;
        this.miAtributoPublico = miAtributoPublico;
        this.miAtributoProtegido = miAtributoProtegido;
        this.miAtributoDefault = miAtributoDefault;
    }

    ///////////////////////////////////////////////////////////////////

    public void prueba() {

        //this.  // Desde aquí tengo acceso a mis atributos private,public,protected y default
    }
}
