public class Animal {

    private String especie;
    private boolean domestico;
    private int edad;
    private String habitat;

    /////////////////////////////////


    public Animal(String especie, boolean domestico, int edad, String habitat) {
        this.especie = especie;
        this.domestico = domestico;
        this.edad = edad;
        this.habitat = habitat;
    }

    public Animal() {
    }

    ////////////////////////////////


    ////////////////////////////////////

    public String emitirSonido() {

        return "grrrcuacpiopiomumuubeeee";
    }

    public void comer() {


    }

    ///////////////////////////////////


    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", domestico=" + domestico +
                ", edad=" + edad +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
