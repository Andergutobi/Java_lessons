package com.patxa.excepciones1;

import javax.swing.*;

public class Principal {

    private static int valor;
    private static int divisor;
    private static int division;

    public static void main(String[] args) {

        //Tenemos dos tipos de excepciones: Chequed y Unchequed
        //Con las Chequed estamos obligados a manejar el error (IOException)
        //Las Unchequed no están obligadas a manejar el error (Runtime Exception)

        //Ejemplo 1
        //int division = 10/0;//ArithmeticException

        //Ejemplo 2 - Tratamos el posible error con try/catch

        String[] miArray = {"Pepito", "Juanito"};

        try {

            String nombre = miArray[5];//ArrayIndexOutOfBoundsException
            int division = 10 / 0;//Si se produce el error en la linea de código anterior, ésta linea no llega a leerse...

        } catch (ArithmeticException e) {//Podríamos haber sustituido el ArithmeticException por un Exception
            //Aquí trataríamos el error y no solamente con mensajes (si lo necesitamos)
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            //Aquí trataríamos el error y no solamente con mensajes (si lo necesitamos)
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Esto se ejecuta siempre: con error o sin error");
        }

        System.out.println("Si se ha producido un error el programa continúa aquí");


        //Ejemplo 3:
        //ArithmeticException
        //NumberFormatException
        try {
            pideDatosUsuario();

        } catch (ArithmeticException e) {

            System.out.println("El error ha sido: " + e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("El error ha sido: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("La excepción que se ha producido no ha sido ni ArithmeticException ni NumberFormatException");

        } finally {

            System.out.println("Esto se ejecuta siempre");
        }


        System.out.println("El progrma ha continuado");


    }


    public static void pideDatosUsuario() {

        valor = Integer.parseInt(JOptionPane.showInputDialog("introduce un número"));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("introduce otro número"));
        division = valor / divisor;
        System.out.println("El resultado de la división es: " + division);


    }


}
