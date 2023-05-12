import java.util.Scanner;

public class Main {

    public static int contarPaquetes(double peso)
    {
        int contadorPaquetes = 0;
        double acumuladorPesoPaquetes = 0;
        double pesoPaquete;
        Scanner scanner = new Scanner(System.in);

        while (acumuladorPesoPaquetes < peso)
        {
            System.out.println("Ingresa Peso Paquete");
            pesoPaquete = scanner.nextDouble();
            acumuladorPesoPaquetes += pesoPaquete;
            contadorPaquetes++;
        }
        return contadorPaquetes;
    }

    public static void main(String[] args) {

    String nombre;
    double cantComidaDiaria;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del perro");
        nombre = scanner.nextLine();

        System.out.println("Ingresa la cantidad de comida que requiere al día");
        cantComidaDiaria = scanner.nextDouble();

        System.out.println("Para alimentar a " + nombre + " se necesitan " + contarPaquetes(cantComidaDiaria) + " paquetes al día");

    }

}