package com.patxa.excepciones2;

public class DivisionCeroException extends Exception {

    //Creamos nuestra excepción PERSONAL
    //Esta clase (esta exception) es chequed porque es un Exception
    //por lo tanto estamos obligados desde el método que lo invoque
    //a manejarlo

    public DivisionCeroException(String message) {
        super(message);
    }


}
