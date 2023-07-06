package com.patxa.clases_genericas;

import java.util.Objects;

public class CajaGenerica<T> {

    private T dato;

    //////////////////////////////////


    public CajaGenerica(T dato) {
        this.dato = dato;
    }

    //////////////////////////////////


    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    /////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CajaGenerica<?> that = (CajaGenerica<?>) o;
        return Objects.equals(dato, that.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato);
    }

    @Override
    public String toString() {
        return "CajaGenerica{" +
                "dato=" + dato +
                '}';
    }
}
