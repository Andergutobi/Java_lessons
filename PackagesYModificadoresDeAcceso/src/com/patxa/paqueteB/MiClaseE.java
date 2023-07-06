package com.patxa.paqueteB;

import com.patxa.paqueteA.MiClaseA;

public class MiClaseE extends MiClaseA {

    private String miAtributoClaseE;

    ///////////////////////////////////////////////////


    public MiClaseE(String miAtributoPrivado, String miAtributoPublico, String miAtributoProtegido, String miAtributoDefault, String miAtributoClaseE) {
        super(miAtributoPrivado, miAtributoPublico, miAtributoProtegido, miAtributoDefault);
        this.miAtributoClaseE = miAtributoClaseE;
    }

    ///////////////////////////////////////////////////

    public void prueba() {

        //this.  // Desde aquí tengo acceso a mis atributos private,public,protected y default(Todas las clases tienen acceso a sus atributos privados directamente)
        //y además tengo acceso a los atributos public, protected de la superclase (MiClaseA). Sin embargo no tengo acceso a los atributos private y default
        //de mi superclase (MiClaseA)

    }
}
