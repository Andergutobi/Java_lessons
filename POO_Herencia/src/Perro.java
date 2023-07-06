public class Perro extends Mamifero {

    private String nombre;
    private String raza;
    private int estadoAnimo;

    ///////////////////////////


    public Perro(boolean domestico, int edad, String habitat, String pelaje, String nombre, String raza, int estadoAnimo) {
        super("canino", domestico, edad, habitat, pelaje);
        this.nombre = nombre;
        this.raza = raza;
        this.estadoAnimo = estadoAnimo;
    }

    public Perro() {

    }
    //////////////////////////////


    //////////////////////////////

    public void jugar() {


    }

    public void correr() {


    }

    ////////////////////////////////////


    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", estadoAnimo=" + estadoAnimo +
                "} " + super.toString();
    }
}
