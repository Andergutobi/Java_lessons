public class Mamifero extends Animal {

    private String pelaje;

    ///////////////////////////


    public Mamifero(String especie, boolean domestico, int edad, String habitat, String pelaje) {
        super(especie, domestico, edad, habitat);
        this.pelaje = pelaje;
    }

    public Mamifero() {

    }

    ////////////////////////////


    //////////////////////////////

    public void amamantar() {


    }

    //////////////////////////////////

    @Override
    public String toString() {
        return "Mamifero{" +
                "pelaje='" + pelaje + '\'' +
                "} " + super.toString();
    }
}
