public class Humano extends Mamifero {

    private String nombre;

    /////////////////////////////////////////////

    public Humano(String especie, boolean domestico, int edad, String habitat, String pelaje, String nombre) {
        super(especie, domestico, edad, habitat, pelaje);
        this.nombre = nombre;
    }


    //////////////////////////////

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                "} " + super.toString();
    }

}
