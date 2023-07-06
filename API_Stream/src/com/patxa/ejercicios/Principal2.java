package com.patxa.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        /*Tenemos una lista de productos List<Producto> , de 3 a 5 elementos. Se pide calcular el importe (precio por cantidad) y sumarlos.

        La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando stream convertir la lista de productos
        en el gran total del tipo double.


                CLASE PRODUCTO

        public class Producto {

            private double precio;
            private double cantidad;

            public Producto(double precio, double cantidad) {
                this.cantidad = cantidad;
                this.precio = precio;
            }

            public double getPrecio() {
                return precio;
            }

            public double getCantidad() {
                return cantidad;
            }
        }*/

        Producto producto1 = new Producto(34.50, 4);
        Producto producto2 = new Producto(12.60, 1);
        Producto producto3 = new Producto(3.50, 7);

        List<Producto> productos = new ArrayList<>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        Double totalFactura = productos.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);

        System.out.println("El total de la factura es: " + totalFactura + "€");


        Double totalFactura2 = productos.stream()
                .mapToDouble(p -> p.getCantidad() * p.getPrecio())
                .sum();

        System.out.println("El total de la factura2 es: " + totalFactura2 + "€");

    }
}
