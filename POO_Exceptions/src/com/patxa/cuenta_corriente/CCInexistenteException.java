package com.patxa.cuenta_corriente;

public class CCInexistenteException extends Exception {

    //Esta excepción es chequed y por lo tanto de obligado tratamiento


    public CCInexistenteException() {
    }

    public CCInexistenteException(String message) {
        super(message);
    }

    public CCInexistenteException(String message, Throwable cause) {
        super(message, cause);
    }

    public CCInexistenteException(Throwable cause) {
        super(cause);
    }

    public CCInexistenteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
