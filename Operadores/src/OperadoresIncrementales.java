public class OperadoresIncrementales {

    public static void main(String[] args) {


        int a = 7;
        int d = 7;

        //PRE INCREMENTO

        int b = ++a;
        System.out.println("b = " + b);//8
        System.out.println("a = " + a);//8


        //POST INCREMENTO

        int c = a++;
        System.out.println("c = " + c);//8
        System.out.println("a = " + a);//9

    }


}
