package com.patxa.casting_objetos;

public class Principal {

    public static void main(String[] args) {

        //DOWNCAST ENTRE TIPOS COMPATIBLES (QUE TEGAN RELACIÓN DE HERENCIA)
        Animal felisa = new Vaca();
        Vaca felisa2 = (Vaca) felisa;

        Object gumersinda = new Vaca();

        if (gumersinda instanceof Vaca) {
            Vaca gumersinda2 = (Vaca) gumersinda;
        }
        IUna gumersinda2 = new Vaca();
        Vaca gumersinda3 = (Vaca) gumersinda2;


        //UPCAST ENTRE TIPOS COMPATIBLES (QUE TENGAN RELACIÓN DE HERENCIA)
        Vaca vaca = new Vaca();
        Animal a = (Animal) vaca;//"DISFRAZO" AL OBJETO vaca DE ANIMAL

        Vaca vaca2 = new Vaca();
        IUna vaca4 = (IUna) vaca2;//"DISFRAZO" AL OBJETO vaca2 DE IUna


        //ERRORES COMUNES ENTRE CASTING DE OBJETOS

        //1) NO EXISTE NINGUNA RELACIÓN DE HERENCIA
        String miString = "Hola mundo";
        //Integer miInteger = (Integer)miString;//TIPOS INCOMPATIBLES


        //2) UN INTEGER NO ES UN DOUBLE. EL CASTING FUNCIONARÍA SI INTEGER TUVIERA
        //RELACIÓN DE HERENCIA CON DOUBLE, PERO NO ES ASÍ.
        //NO PODEMOS HACE CASTING ENTRE TIPOS WRAPPER.
        Integer n = 6;//BOXING AUTOMÁTICO
        //Double d = (Double)n;//SON COMPATIBLES PERO INCONVERTIBLES


        //3) JAVA NO PERMITE EL CASTING DE UN TIPO DE REFERENCIA A UN PRIMITIVO SINO MEDIANTE UNBOXING
        Long miLong = 345L;
        //int miIntPrimitivo = (int)miLong;//Tipos inconvertibles


    }


}


