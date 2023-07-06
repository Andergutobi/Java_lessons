package com.patxa.paqueteA;

public class MiClaseC {

    private String miAtributoClaseC;

    ///////////////////////////////////////////////


    public MiClaseC(String miAtributoClaseC) {
        this.miAtributoClaseC = miAtributoClaseC;
    }


    ////////////////////////////////////////////

    public void prueba() {

        //this. //desde this. tengo acceso a mis atributos tanto public como protected, private y default
        MiClaseA instanciaA = new MiClaseA("Atributo privado", "Atributo público", "Atributo protegido", "Atributo default");
        //instanciaA.  //desde aquí tengo acceso a los atibutos public, protected y default de la clase MiClaseA. No tengo acceso a los atributos private.

    }
}
