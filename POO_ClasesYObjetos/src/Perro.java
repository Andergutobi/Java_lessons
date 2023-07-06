public class Perro {

    //ATRIBUTOS - PROPIEDADES
    private String genero;
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private int estadoAnimo;//de 0 a 10 siendo 10 estado ánimo excelente
    private double precio;

    //CONSTRUCTOR

    public Perro(String genero, String nombre, int edad, String raza, String color, int estadoAnimo, double precio) {
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.estadoAnimo = estadoAnimo;
        this.precio = precio;
    }


    //GETTERS Y SETTERS

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(int estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //MÉTODOS

    public String correr() {

        return this.nombre + " corriendo";
    }

    public String saltar() {

        return this.nombre + " saltando";

    }


    public String jugarConPerro(Perro elPerro) {

        this.estadoAnimo = this.estadoAnimo + 1;
        //elPerro.estadoAnimo = elPerro.estadoAnimo + 1;
        elPerro.setEstadoAnimo(++estadoAnimo);
        return this.nombre + " jugando con " + elPerro.getNombre();

    }


    public String jugar() {

        return "perro jugando";
    }


    public String ladrar(int nVeces) {

        if (nVeces != 0) {
            String ladridos = "";

            for (int i = 1; i <= nVeces; i++) {

                ladridos = ladridos + " guau!";

            }

            return this.nombre + ladridos;

        } else {

            return this.nombre + " no está ladrando";
        }

    }

    //EQUALS, HASHCODE, TOSTRING...

    @Override
    public String toString() {
        return "Perro{" +
                "genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", estadoAnimo=" + estadoAnimo +
                '}';
    }
}
