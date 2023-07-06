package com.patxa.interfaces.herencia;

public class Principal {

    public static void main(String[] args) {

        Vaca gumersinda = new Vaca();

        //babieca tiene sus métodos (sobreescritos obligatoriamente y el
        //el método "metodoNaturaleza" implementado por su superclase Animal
        Caballo babieca = new Caballo();//Instancia sin polimorfismo

        //babieca2 solo tiene los métodos de Object porque la variable es de tipo Object
        Object babieca1 = new Caballo();

        //babieca3 tiene los métodos de Naturaleza y de Object porque la variable es de tipo Naturaleza
        //A pesar de que nos pueda parecer que el método "metodoNaturaleza" no pertenece a Naturaleza
        //porque está implementado en la clase Animal, no debemos olvidar que el método está sobreescrito
        //EN LA CLASE NATURALEZA. Por lo tanto pertenece a Naturaleza.
        Naturaleza babieca3 = new Caballo();

        //babieca4 tiene los métodos de IUna de IDos de ITres y de Object
        IUna babieca4 = new Caballo();


        //Granero babieca5 = new Caballo();//Esto no es posible ya que los tipos son incompatibles


    }


}
