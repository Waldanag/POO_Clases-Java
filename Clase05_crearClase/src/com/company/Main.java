package com.company;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(11111, "Juan");
        System.out.println(cliente1);
        cliente1.ingrementarDeuda(10000.0);
        System.out.println( "Deuda: " + cliente1.getDeuda());
        cliente1.pagarDeuda();
        System.out.println( "Deuda: " + cliente1.getDeuda());

        Cliente cliente2 = new Cliente();

        cliente2.setNombre("Julieta");
        System.out.println(cliente2);
        Cliente.cambiarBanco("Provincia");
        System.out.println(cliente2);

    }

}