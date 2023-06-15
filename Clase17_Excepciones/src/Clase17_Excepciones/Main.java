package Clase17_Excepciones;

public class Main {
    public static void main(String[] args) {

        /*double res;
        int n1, n2;
        n1=5;
        n2=0;
        try {
            res = n1 / n2;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error, no se puede dividir por cero ");
        }*/

        Cliente cliente = new Cliente("Juan", "Perez", "1111111", 10000);

        try{
            cliente.saldarDeuda(1000);
        }catch (ClienteExcepcion c){
            System.err.println(c.toString());
        }

        try {
            System.out.println("Primer consumo");
            cliente.comprar(5000);
            System.out.println("Otro consumo");
            cliente.comprar(10000);
            System.out.println("Fin");
        }
        catch (ClienteExcepcion c)
        {
            System.err.println("Ocurrio el siguiente error " + c.getMessage());
        }

    }
}