public class Ejercicio6 {

    public static void main(String[] args) {

        //De una consulta a una BBDD nos llega un telefono con el siguiente formato: 5256284000
        //Debemos dejarlo así: (52)-5-6284000

        String telefono = "5256284000";
        //substring
        String sub1 = telefono.substring(0, 2);//52
        String sub2 = telefono.substring(2, 3);//5
        String sub3 = telefono.substring(3);//6284000

        System.out.println("(" + sub1 + ")" + "-" + sub2 + "-" + sub3);

    }
}
