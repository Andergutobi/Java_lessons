package com.patxa.casting_primitivos;

public class Principal {

    public static void main(String[] args) {

        //CASTING AUTOMÁTICO
        //PARA QUE ESTO SUCEDA DEBEN DE DARSE DOS PREMISAS:
        //1) QUE LOS TIPOS SEAN COMPATIBLES: EN JAVA LOS DATOS NUMÉRICOS SON COMPATIBLES 
        //(LOS TIPOS CHAR SON COMPATIBLES CON LOS NUMÉRICOS PERO NO ADMITEN CONVERSIÓN AUTOMÁTICA).
        //LOS DATOS BOOLEAN NO SON COMPATIBLES CON NINGÚN OTRO
        //2) EL CASTING AUTOMÁTICO SOLO SUCEDE CUANDO SE HACE DE UN TIPO MÁS PEQUEÑO A OTRO MÁS GRANDE

        //EN ESTOS EJEMPLOS SE CUMPLEN AMBAS PREMISAS:
        int i = 100;
        float f = i; // CASTING AUTOMÁTICO DE INT A FLOAT
        long l = i;// CASTING AUTOMÁTICO DE INT A LONG

        int o = 100; // LO QUEREMOS PASAR A CHAR LO CUAL ES POSIBLE PORQUE NÚMEROS Y CHAR SON COMPATIBLES
        //char ch = o; // ESTO ES POSIBLE PERO NO DE MANERA AUTOMÁTICA...
        char ch = (char) o; //TENEMOS QUE HACER CASTING MANUAL

        //boolean b = o;// TIPOS INCOMPATIBLES - NO SE PUEDE HACER CASTING AUTOMÁTICO
        //boolean b = (boolean)o; // TIPOS INCOMPATIBLES - NO SE PUEDE HACER CASTING


        //CASTING MANUAL
        //SI QUEREMOS ASIGNAR UN TIPO MAS GRANDE A UNO MAS PEQUEÑO (SIEMPRE Y CUANDO SEAN COMPATIBLES)
        //DEBEMOS HACERLO MANUALMENTE.
        //TENEMOS QUE SER CUIDADOSOS DE QUE NO SE PRODUZCA UNA PÉRDIDA DE DATOS POR RANGO INSUFICIENTE
        //EN EL NUEVO TIPO.

        //JAVA NO TE AVISA DE LA PÉRDIDA DE DATOS
        double d = 100777777755555555555555555555555555555555555555.45643322234;
        long l2 = (long) d;
        System.out.println("l2 = " + l2);//l2 = 9223372036854775807

        int i2 = 1999999445;
        //short s = i2; // AUTOMÁTICAMENTE NO LO PERMITE
        short s = (short) i2;
        System.out.println("s = " + s);//s = -28203

        //UN CHAR SE PUEDE HACER PERFECTAMENTE PORQUE ES COMPATIBLE
        int p = 100;
        char char3 = (char) p;
        System.out.println("char3 = " + char3);//char3 = d

        float f4 = 1999.94455F;
        int i23 = (int) f4;
        System.out.println("i23 = " + i23);//i23 = 1999 (HAY VECES QUE EL RESULTADO ES MÁS INCOHERENTE POR LO QUE NO DEBEMOS CONFUNDIR ESTE CASTEO CON UN REDONDEO


        double d4 = 1999.94455;
        int i233 = (int) d4;
        System.out.println("i233 = " + i233);//i23 = 1999 (HAY VECES QUE EL RESULTADO ES MÁS INCOHERENTE POR LO QUE NO DEBEMOS CONFUNDIR ESTE CASTEO CON UN REDONDEO


    }
}
