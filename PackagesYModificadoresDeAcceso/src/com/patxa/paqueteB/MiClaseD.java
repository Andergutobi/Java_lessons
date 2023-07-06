package com.patxa.paqueteB;

import com.patxa.paqueteA.MiClaseA;

public class MiClaseD {

    private String miAtributoClaseD;

    ////////////////////////////////////////


    public MiClaseD(String miAtributoClaseD) {
        this.miAtributoClaseD = miAtributoClaseD;
    }

    ////////////////////////////////////////////////

    public void prueba() {

        //this. //desde this. tengo acceso a mis atributos tanto public como protected, private y default
        MiClaseA instanciaA = new MiClaseA("Atributo privado", "Atributo público", "Atributo protegido", "Atributo default");
        //instanciaA.  //solo tengo acceso a los atributos public

    }

}
