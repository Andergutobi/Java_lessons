package com.patxa.interfaces.polimorfismo;

import java.util.ArrayList;

public abstract class Personal implements IUbicable {

    private int salario;
    private String nombre;
    private int edad;
    private boolean disponible;//Si está de vacaciones. Si está efectuando otra tarea. Si está de baja...
    private int estadoSalud;//0 mala salud
    private int destreza;//de 0 a 10
    private IHabitable ubicacion;
    private ArrayList<Transporte> mediosTransporte = new ArrayList<>();

    ////////////////////////////////////////

    public Personal(int salario, String nombre, int edad, boolean disponible, int estadoSalud, int destreza, IHabitable ubicacion) {
        this.salario = salario;
        this.nombre = nombre;
        this.edad = edad;
        this.disponible = disponible;
        this.estadoSalud = estadoSalud;
        this.destreza = destreza;//De O a 10;
        this.ubicacion = ubicacion;
    }


    /////////////////////////////////////////////


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(int estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public IHabitable getUbicacion() {
        return ubicacion;
    }

    @Override
    public void setUbicacion(IHabitable ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Transporte> getMediosTransporte() {
        return mediosTransporte;
    }

    public void setMediosTransporte(ArrayList<Transporte> mediosTransporte) {
        this.mediosTransporte = mediosTransporte;
    }

    //////////////////////////////////////////////////////


    public void conducir(Transporte elTransporte, IHabitable elHabitable) {

        //Para utilizar el medio lo primero es comprobar si es mio

        if (this.mediosTransporte.contains(elTransporte)) {

            this.ubicacion = elHabitable;//Ubicamos al conductor en su destino
            elTransporte.setUbicacion(elHabitable);//Ubicamos el transporte en su destino

            //Si el transporte es de carga (un camion o un tractor, ubicamos la carga

            if (!elTransporte.getCarga().isEmpty()) {
                for (IUbicable elemento : elTransporte.getCarga()) {

                    elemento.setUbicacion(elHabitable);

                }
            }

            elTransporte.getCarga().clear();//vaciamos el transporte


        } else {

            Mensajes.mensajeSimple("El medio de transporte no es tuyo y por lo tanto no lo puedes utilizar");

        }


    }


    ///////////////////////////////////////////////////////


}
