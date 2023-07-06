package com.patxa.wrapper;

public class Principal {

    public static void main(String[] args) {
        ///////////////////////////////////////////////////////
        //BOXING
        ///////////////////////////////////////////////////////
        //Forma correcta de crear un objeto Wrapper de forma manual: boxing de forma manual
        Integer miObjetoEntero = Integer.valueOf(5);
        Integer miObjetoEntero2 = Integer.valueOf("234");
        Character miObjetoCharacter = Character.valueOf('m');
        Boolean miObjetoBoolean = Boolean.valueOf(true);

        //Forma correcta de crear un objeto Wrapper de forma automática: autoboxing
        Integer miObjetoEntero3 = 67;
        Character miObjetoCharacter2 = 'm';
        Boolean miObjetoBoolean2 = false;

        //Siempre que creemos un objeto Wrapper con autoboxing tenemos que tener en cuenta
        //el valor que le pasamos
        Long miObjetoShort = 5363737388383393L;

        //Unboxing maunual
        int miEnteroPrimitivo = miObjetoEntero.intValue();
        System.out.println("miEnteroPrimitivo = " + miEnteroPrimitivo);//5
        char miCaracterPrimitivo = miObjetoCharacter2.charValue();//'m'
        boolean miBooleanPrimitivo = miObjetoBoolean2.booleanValue();//false

        //Unboxing automático
        int miEnteroPrimitivo2 = miObjetoEntero2;//234


    }
}
