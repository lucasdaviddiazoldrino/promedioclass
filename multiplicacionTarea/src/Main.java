/*
Ejercicio 4: Hacer un programa que le pida dos números enteros al usuario/a. Al final, el programa imprime por pantalla el siguiente mensaje:

El resultado de la suma es: "valor"
[3:20 PM]
Ejercicio 5: Hacer un programa que le pida dos números enteros al usuario/a. Al final, el programa imprime por pantalla el siguiente mensaje:

El resultado de la multiplicación es: "valor"
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        // declaracion de variables
        int numero1;
        int numero2;
        //crear objeto scanner
        Scanner input = new Scanner (System.in);

        System.out.println("bienvenido inserte el primer numero" );
        //instanciar la variable
        numero1 = input.nextInt();
        System.out.println("bienvenido inserte el segundo numero" );
        //instanciar la variable 2
        numero2 = input.nextInt();
        //creacion de la variable para almacenar resultado
        int resultadoSuma = numero1 * numero2;

        System.out.println("el resultado de tu multiplicacion es " + resultadoSuma );


    }
}