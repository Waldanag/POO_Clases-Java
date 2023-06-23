package Ejercitacion;

public class Cerrado implements Estado{
    private Carrito c;

    public Cerrado(Carrito c) {
        System.out.println("El pedido está cerrado");
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {

    }

    @Override
    public void cancelarCarrito() {

    }

    @Override
    public void volverPunto() {

    }

    @Override
    public void siguienteEstado() {

    }
}
