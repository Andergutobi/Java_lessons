package com.patxa.paqueteA;

//import com.joselu.paqueteB.MiClaseD;
//import com.joselu.paqueteB.MiClaseE;

import com.patxa.paqueteB.*;

public class Principal {

    public static void main(String[] args) {

        MiClaseA instanciaA = new MiClaseA("Atributo privado", "Atributo público", "Atributo protegido", "Atributo default");
        MiClaseB instanciaB = new MiClaseB("Atributo privado", "Atributo público", "Atributo protegido", "Atributo default", "Atributo clase B");
        MiClaseC instanciaC = new MiClaseC("Atributo clase C");
        MiClaseD instanciaD = new MiClaseD("Atributo clase D");
        MiClaseE instanciaE = new MiClaseE("Atributo privado", "Atributo público", "Atributo protegido", "Atributo default", "Atributo clase E");


    }
}
