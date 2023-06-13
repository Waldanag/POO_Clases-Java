package Ejercitacion;

public class Main {

    public static void main(String[] args) {


        Contenedor contenedor1 = new Contenedor(1012, "Chile", false);
        Contenedor contenedor2 = new Contenedor(1011, "Chile", true);
        Contenedor contenedor3 = new Contenedor(1010, "Arg", false);
        Contenedor contenedor4 = new Contenedor(1013, "Desconocida", true);
        Contenedor contenedor5 = new Contenedor(1014, "Holanda", false);

        Puerto puerto = new Puerto();

        puerto.ingresarContenedor(contenedor1);
        puerto.ingresarContenedor(contenedor2);
        puerto.ingresarContenedor(contenedor3);
        puerto.ingresarContenedor(contenedor4);
        puerto.ingresarContenedor(contenedor5);

        System.out.println(puerto.mostrarContenedores());
        System.out.println("La cantidad de contenedores peligrosos de procedencia desconocida es " + puerto.cantidadContenedoresPeligrosos("Desconocida"));

    }

}
