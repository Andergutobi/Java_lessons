package com.joselu.list.models;

public class Arbol implements Comparable<Arbol> {

    private String nombre;
    private int altura;

    ////////////////////////////


    public Arbol(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    ////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //////////////////////////////////////////


    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                '}';
    }


    @Override
    public int compareTo(Arbol elArbol) {

        return this.getAltura() - elArbol.getAltura();//por altura

        //return this.getNombre().compareTo(elArbol.getNombre());//por orden alfabético


        //Criterio de comparación por altura (a la carta)
        /*if(this.getAltura() > elArbol.getAltura()){

            return 1;

        }else if (this.getAltura() < elArbol.getAltura()){

            return -1;

        }else{
            return 0;//si yo soy igual al objeto que llega según criterio que en esta caso es la altura
        }*/

    }


}
