package Clase02;

import java.util.Scanner;

public class textosDistintos {

    public static boolean cadenasDeTextoDistintas(String textoA, String textoB){

        if (textoA.equals(textoB)){
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        String textoA;
        String textoB;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el 1er texto");
        textoA = scanner.next();
        System.out.println("Ingresa el 2do texto");
        textoB = scanner.next();

        Boolean comparacion = cadenasDeTextoDistintas(textoA, textoB);
        System.out.println(comparacion);

        //if (comparacion = true){
        //    System.out.println("Los textos no coinciden");
        //} else {
        //    System.out.println("Los textos coinciden");
        //}

    }


}
