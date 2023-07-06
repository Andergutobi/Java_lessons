package com.patxa.mundo_tolkien;

import java.util.List;

public class Barco extends MedioTransporte {

    public Barco(Ciudades ubicacion, Double precio, Calidad calidad, Material material, String contenido, List<Personaje> pasajeros, Integer tara) {
        super(ubicacion, precio, calidad, material, contenido, pasajeros, tara);
    }
}
