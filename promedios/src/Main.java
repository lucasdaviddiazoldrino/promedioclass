import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracion de variable
        float nota1;
        float nota2;
        float nota3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nota1" );


        nota1 = input.nextFloat();

        System.out.println("Ingrese nota2" );

        nota2 = input.nextFloat();

        System.out.println("Ingrese nota3" );

        nota3 = input.nextFloat();

        float promedio;
        promedio= (nota1+nota2+nota3)/3;

        System.out.println("El promedio es " + promedio);

        if (promedio>=7){
            System.out.println("PROMOCIONADO");
        } else if ((promedio>=4)&&(promedio<=6)) {
            System.out.println("rinde final");
        }  else if (promedio<=3){
            System.out.println("Desaprobado");
        }

    }
}