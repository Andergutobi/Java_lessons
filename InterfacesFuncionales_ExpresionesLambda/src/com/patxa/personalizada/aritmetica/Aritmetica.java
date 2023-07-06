package com.patxa.personalizada.aritmetica;

@FunctionalInterface
public interface Aritmetica<T> {

    T operacion(T a, T b);

}
