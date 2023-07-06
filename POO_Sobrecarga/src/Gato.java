public class Gato {

    private int edad;
    private String nombre;

    ///////////////////////////////////////

    public Gato() {
    }

    public Gato(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Gato(int edad) {
        this.edad = edad;
    }

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    ///////////////////////////////////////

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ////////////////////////////////////////

    public String maullar() {

        return "miaaaauuuuuu";
    }

    public String maullar(String maullido) {

        return maullido;
    }

    public String maullar(int nVeces, String maullido) {

        String maullidoFinal = "";

        for (int i = 1; i <= nVeces; i++) {
            maullidoFinal = maullidoFinal + " " + maullido;
        }

        return maullidoFinal;


    }


    ////////////////////////////////////////


}
