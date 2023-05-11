import java.util.Scanner;

public class Main {

    public static int comparaMaximoValor(int valorA, int valorB, int valorC)
    {
        int valorD = valorA;
        if(valorB>valorA){
            valorD=valorB;
        }
        if(valorC>valorD){
            valorD=valorC;
        }
        return valorD;
    }

    public static void main(String[] args) {

        int valorA, valorB, valorC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imputar valorA");
        valorA = scanner.nextInt();
        System.out.println("Imputar valorB");
        valorB = scanner.nextInt();
        System.out.println("Imputar valorC");
        valorC = scanner.nextInt();

        int comparacion = comparaMaximoValor(valorA, valorB, valorC);
        System.out.println(comparacion);

    }




}