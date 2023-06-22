package Ejercitacion;

public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        ProductoFactory productoFactory = ProductoFactory.obtenerInstancia();

        Caja prod1 = (Caja) productoFactory.crearProducto(productoFactory.CAJA_10X10, 200);
        almacen.agregarProducto(prod1);

        Pelota prod2 = (Pelota) productoFactory.crearProducto(productoFactory.PE_FUT, 20);
        almacen.agregarProducto(prod2);

        Pelota prod3 = (Pelota) productoFactory.crearProducto(productoFactory.PE_TENIS, 3);
        almacen.agregarProducto(prod3);

        double espacio = almacen.calcularEspacioNecesario();
        System.out.println(espacio);



    }

}
