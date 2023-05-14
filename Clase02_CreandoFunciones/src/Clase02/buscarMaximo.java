package Clase02;

import java.util.Scanner;

/*INGRESAR 3 NUMEROS Y VER CUAL ES EL MAYOR*/
public class buscarMaximo {

    public static Integer maximoEntreTresNumeros(Integer numA, Integer numB, Integer
            numC){

        if (numA > numB && numA > numC){
            return numA;
        } else if (numB > numA && numB > numC) {
            return numB;
        } else {
            return numC;
        }
    }

    public static void main(String[] args){

        Integer numA;
        Integer numB;
        Integer numC;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un 1er número");
        numA = scanner.nextInt();
        System.out.println("Ingrese un 2do número");
        numB = scanner.nextInt();
        System.out.println("Ingrese un 3er número");
        numC = scanner.nextInt();

        //Integer comparacion = maximoEntreTresNumeros(numA, numB, numC);
        //System.out.println(comparacion);

        System.out.println("El numero mayor es el " + maximoEntreTresNumeros(numA, numB, numC));

    }


}


