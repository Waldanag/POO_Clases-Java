package Clase02;

import java.util.Scanner;

/*INGRESAR UN NUMERO Y VER SI ES PRIMO O NO*/

public class numerosPrimos {

    public static boolean esPrimo(int num){

        int contadorDivisores = 0;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                contadorDivisores++;
            }
        }
        return contadorDivisores == 0;
    }

    public static void main(String[] args) {

        int num1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero al azar");
        num1 = scanner.nextInt();

        if (esPrimo(num1)){
            System.out.println("Es Primo");
        }
        else {
            System.out.println("No Es Primo");
        }

    }

}
