package com.patxa.estatico.models;

public class Usuario {

    private static int nUsuarios = 0;
    private String nombre;
    private String password;

    /////////////////////////////////////////////////////


    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        nUsuarios++;
    }

    ///////////////////////////////////////////////////////

    public static int getnUsuarios() {
        return nUsuarios;
    }

    public static void setnUsuarios(int nUsuarios) {
        Usuario.nUsuarios = nUsuarios;
    }

    public static void metodoEstatico() {


        //metodoNoEstatico(); //No es posible. No se puede llamar a un método no-static desde el contexto static

    }

    public static void metodoEstatico2() {

        System.out.println("Soy un método static llamado por un método no static");


    }

    ////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //////////////////////////////////////////////////////////
    //ESTO ES UN MÉTODO NO ESTÁTICO Y POR LO TANTO LO ADQUIEREN TODAS LAS INSTANCIAS DE ESTA CLASE
    public String login(String pass) {

        if (pass.equals(this.password)) {

            return "La contraseña es correcta. Bienvenido";

        } else {

            return "La contraseña es incorrecta. Inténtelo de nuevo";
        }


    }

    public void metodoNoEstatico() {

        metodoEstatico2();//Es permitido llamar a un método static desde el entorno no-static


    }


}
