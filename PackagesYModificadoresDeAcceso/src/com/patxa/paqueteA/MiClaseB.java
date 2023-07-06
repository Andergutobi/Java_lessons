package com.patxa.paqueteA;

public class MiClaseB extends MiClaseA {

    private String miAtributoClaseB;

    ///////////////////////////////////////////////////////////////////////


    public MiClaseB(String miAtributoPrivado, String miAtributoPublico, String miAtributoProtegido, String miAtributoDefault, String miAtributoClaseB) {
        super(miAtributoPrivado, miAtributoPublico, miAtributoProtegido, miAtributoDefault);
        this.miAtributoClaseB = miAtributoClaseB;
    }

    ////////////////////////////////////////////////////////////////////////

    public void prueba() {

        //this.  // Desde aquí tengo acceso a mis atributos private,public,protected y default(Todas las clases tienen acceso a sus atributos privados directamente)
        //y además tengo acceso a los atributos public, protected y default de la superclase (MiClaseA). Sin embargo no tengo acceso a los atributos private
        //de mi superclase (MiClaseA)
    }
}
