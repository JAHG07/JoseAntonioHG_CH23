package tiposDeDatosYVariables;

public class TiposDeDatos {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        byte HT =8;
        byte PG = 10;
        System.out.print("Tu pago total es "+(HT*PG));

        double num=1.61; 
        int numInt = (int) num; 
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        String cantidad ="15";
        String precio = "115.20";
        int cantEntero = Integer.parseInt(cantidad); 
        double precioDouble = Double.parseDouble(precio);
        
        int cantEntero1 = Integer.parseInt(cantidad);  
        double precioDouble1 = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: "+ (cantEntero1 * precioDouble1));
        int edad = 30;
        
        double estatura = 1.61;
        String edadStrin = String.valueOf (edad);

        String estaturaStrin = String.valueOf (estatura);
        System.out.println("Edad: " + (edadStrin + estaturaStrin));
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);

        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
        
/*
 Ejercicio 1
Declara 3 variables de tipo entero y utiliza el operador * y %
*/
        byte i = 3;
        byte a = 4;
        byte b = 5;
        System.out.print("Las suma es " + (i+a) + " El residuo es :" + (i%b));
/*        
Ejercicio 2
Declara dos variables de tipo boolean y utiliza el operador ==
*/
        boolean boolf = false;
        boolean boolf1 = false;
        System.out.print(boolf == boolf1);
 /*
Ejercicio 3
Declara dos variables de tipo Double y utiliza el operador <
*/
        double gg = 3.1415,rr= 55.22;
        System.out.println(gg<rr);
        
        float Fahrenheit = 55;
        float Celcius = (float) ((Fahrenheit-32)/1.8);
        System.out.println("En celcius es : " + Celcius);
        float Kelvin = (float) (Celcius + 273.15);
        System.out.println("En Kelvin es : " + Kelvin);

        System.out.println( (4 % 2) == 0);
        if (4%2 == 0) {
        	System.out.print("Es par");
        }
        else {
        	System.out.print("Es inpar");
        }
        /**/
    }
    

}