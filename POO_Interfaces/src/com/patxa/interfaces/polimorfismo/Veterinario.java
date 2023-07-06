package com.patxa.interfaces.polimorfismo;

public class Veterinario extends Personal {

    private String nAfiliacion;


    //////////////////////////////////////////////

    public Veterinario(int salario, String nombre, int edad, boolean disponible, int estadoSalud, int destreza, IHabitable ubicacion, String nAfiliacion) {
        super(salario, nombre, edad, disponible, estadoSalud, destreza, ubicacion);
        this.nAfiliacion = nAfiliacion;
    }


    //////////////////////////////////////////////

    public String getnAfiliacion() {
        return nAfiliacion;
    }

    public void setnAfiliacion(String nAfiliacion) {
        this.nAfiliacion = nAfiliacion;
    }

    ////////////////////////////////////////////


    public void operar(Animal elAnimal, HospitalVeterinario elHospital) {

        //El veterinario sabe donde hay que operar. En el caso de que no esté en el lugar se desplaza
        //Por lo tanto el veterinario está siempre en el hospital determinado

        if (this.getUbicacion().equals(elHospital)) {

            //no me muevo

        } else {

            //voy al hospital


        }


        if (elAnimal.getUbicacion().equals(elHospital)) {

            Mensajes.mensajeSimple("el Animal está en el Hospital Veterinario");

        } else {

            Mensajes.mensajeSimple("El Animal no está en al Hospital Veterinario");
        }


    }

}
