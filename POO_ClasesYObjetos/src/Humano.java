import java.util.ArrayList;

public class Humano {

    private String nombre;
    private int estadoAnimo;
    private double dinero;
    private ArrayList<Perro> misPerros = new ArrayList<>();


    ///////////////////////////////////

    public Humano(String nombre, int estadoAnimo, double dinero) {
        this.nombre = nombre;
        this.estadoAnimo = estadoAnimo;
        this.dinero = dinero;
    }


    /////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(int estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Perro> getMisPerros() {
        return misPerros;
    }

    public void setMisPerros(ArrayList<Perro> misPerros) {
        this.misPerros = misPerros;
    }

//////////////////////////////////////////

    public void adoptarPerro(Perro elPerro) {

        if (this.dinero >= elPerro.getPrecio()) {
            double precio = elPerro.getPrecio();
            this.dinero = this.dinero - precio;
            misPerros.add(elPerro);
            System.out.println(misPerros);
        } else {
            System.out.println("No tienes suficiente dinero");
        }


    }


    public String jugarConPerro(Perro elPerro) {

        this.estadoAnimo = this.estadoAnimo + 1;
        elPerro.setEstadoAnimo(elPerro.getEstadoAnimo() + 1);
        return this.nombre + " jugando con " + elPerro.getNombre();

    }


    public void darOrdenPerro(Perro elPerro, String orden) {
        //Dependiendo de la orden quiero que el perro que recibo como argumento salte o corra

        if (orden.equals("salta!")) {
            System.out.println(elPerro.saltar());

        } else if (orden.equals("corre!")) {
            System.out.println(elPerro.correr());

        } else {
            System.out.println("La orden no ha sido reconocida");
        }

    }


    /////////////////////////////////////////////


    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
