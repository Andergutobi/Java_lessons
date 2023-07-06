package com.patxa.estatico;

import com.patxa.estatico.models.SubUsuario;
import com.patxa.estatico.models.Usuario;

public class Principal {

    public static void main(String[] args) {


        Usuario agustin = new Usuario("Agustin", "admin");
        Usuario enrique = new Usuario("Enrique", "abc");

        SubUsuario subEnrique = new SubUsuario("SubEnrique", "subAdmin");

        //SubUsuario. //Desde la subclase tengo acceso a los atributos y a los métodos static de la superclase

        //el usuario enrique llama a un método no static que a su vez llama a un método static

        enrique.metodoNoEstatico();

        //String pass = JOptionPane.showInputDialog("Introduzca la contraseña");

        //String resultado = agustin.login(pass);

        //System.out.println("resultado = " + resultado);
        //JOptionPane.showMessageDialog(null, resultado);

        //enrique. //no tenemos acceso a los métodos static

        //enrique. //no tenemos acceso a los atributos static

        //Desde la clase accedemos a los atributos static
        System.out.println("El número de usuarios es: " + Usuario.getnUsuarios());

        //Usuario. //Tenemos acceso a todos los métodos static pero no a los no static

    }
}
