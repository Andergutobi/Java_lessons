package com.patxa.mundo_tolkien;

import java.util.ArrayList;
import java.util.List;

public final class Personaje extends MundoTolkien {

    private Double dinero;
    private Profesion profesion;
    private Rol rol;
    private String nombre;

    private List<IComerciable> inventarioMercaderia = new ArrayList<>();
    private List<IComerciable> inventarioArma = new ArrayList<>();
    private List<IComerciable> inventarioMedioTransporte = new ArrayList<>();
    private List<IComerciable> inventarioConstruccion = new ArrayList<>();

    //En Generics lo que parece que es lógico (QUE List<Construccion> herede de List<MundoTolkien> por
    //el hecho de que Consruccion herede de MundoTolkien ) no se da. No existe este tipo de herencia en Generics
    private List<List<? extends IComerciable>> inventarioGeneral = new ArrayList<>();


    /////////////////////////////////////////////////////////////////


    public Personaje(Ciudades ubicacion, Profesion profesion, Rol rol, String nombre) {
        super(ubicacion);
        this.dinero = 500.0;
        this.profesion = profesion;
        this.rol = rol;
        this.nombre = nombre;
        this.inventarioGeneral.add(inventarioMercaderia);//item 0
        this.inventarioGeneral.add(inventarioArma);//item 1
        this.inventarioGeneral.add(inventarioMedioTransporte);//item 2
        this.inventarioGeneral.add(inventarioConstruccion);//item 3

    }

    ////////////////////////////////////////////////////////////////////


    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<List<? extends IComerciable>> getInventarioGeneral() {
        return inventarioGeneral;
    }


    ////////////////////////////////////////////////////////

    public void comprar(IComerciable item, ArrayList<IComerciable> arrayComerciables) {

        //System.out.println(item.getClass().getSuperclass().getSimpleName());
        //Comprobamos si tiene dinero
        if (this.dinero >= item.getPrecio()) {

            this.dinero = this.dinero - item.getPrecio();//Pagamos

            switch (item.getClass().getSuperclass().getSimpleName()) {

                case "Arma":
                    inventarioArma.add(item);//Metemos el item en la cesta
                    break;

                case "Mercaderia":
                    inventarioMercaderia.add(item);//Metemos el item en la cesta
                    break;

                case "MedioTransporte":
                    inventarioMedioTransporte.add(item);//Metemos el item en la cesta
                    break;

                case "Construccion":
                    inventarioConstruccion.add(item);//Metemos el item en la cesta
                    break;


            }

            arrayComerciables.remove(item);//eliminamos el elemento comprado de la lista original


        } else {

            Panel.mensajeSimple("No tienes suficiente dinero");
        }


        //System.out.println(item.getContenido());

    }


    //////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Personaje{" +
                "dinero=" + dinero +
                ", profesion=" + profesion +
                ", rol=" + rol +
                ", nombre='" + nombre + '\'' +
                ", inventarioMercaderia=" + inventarioMercaderia +
                ", inventarioArma=" + inventarioArma +
                ", inventarioMedioTransporte=" + inventarioMedioTransporte +
                ", inventarioConstruccion=" + inventarioConstruccion +
                ", inventarioGeneral=" + inventarioGeneral +
                "} " + super.toString();
    }
}
