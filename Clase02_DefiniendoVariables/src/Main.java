import java.util.Scanner;

public class Main {
    public static String armarFecha(int d, int m, int a){
        return d + "/" + m + "/" + a;
    }


    public static void main(String[] args) {

        String nombre, apellido, iniciales="";
        String fecha;
        int dia, mes, anio;

        Scanner scanner =new Scanner(System.in) ;
        System.out.println("Ingresa tu nombre");
        nombre=scanner.nextLine();
        System.out.println("Ingresa tu apellido");
        apellido=scanner.nextLine();

        //iniciales+=nombre.charAt(0)+ ""+apellido.charAt(0);
        //System.out.println(iniciales);

        iniciales+=nombre.charAt(0);
        iniciales+=apellido.charAt(0);
        System.out.println(iniciales);

        System.out.println("Ingresa día");
        dia=scanner.nextInt();
        System.out.println("Ingresa mes");
        mes = scanner.nextInt();
        System.out.println("Ingresa año");
        anio = scanner.nextInt();
        fecha = armarFecha(dia, mes, anio);
        System.out.println(fecha);

    }

}