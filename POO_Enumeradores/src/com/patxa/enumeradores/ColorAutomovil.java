package com.patxa.enumeradores;

public enum ColorAutomovil {

    //////////////////////////////////////////////////////////////////////
    //Aquí vamos a definir el nombre de las instancias (únicas instancias)
    //que va a tener la FUTURA CLASE "ColorAutomovil"
    ROJO("Rojo metalizado", "123456"),//ColorAutomovil ROJO = new ColorAutomovil("Rojo","123456")
    AMARILLO("Amarillo limón", "678765"),
    AZUL("Azul cielo", "876567"),
    BLANCO("Blanco nieve", "987123"),
    GRIS("Gris metalizado", "444555");//la última instancia es con punto y coma

    ////////////////////////////////////////////////////
    //AQUÍ ES DONDE EMPEZARÍA (NO ES OBLIGATORIO) UNA CLASE NORMAL
    private String color;
    private String refColor;

    ////////////////////////////////////////////////////


    ColorAutomovil(String color, String refColor) {
        this.color = color;
        this.refColor = refColor;
    }
    ///////////////////////////////////////////////////


    public String getColor() {
        return color;
    }

    public String getRefColor() {
        return refColor;
    }
}
