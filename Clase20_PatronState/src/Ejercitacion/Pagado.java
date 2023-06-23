package Ejercitacion;

public class Pagado implements Estado{
    private Carrito c;

    public Pagado(Carrito c) {
        System.out.println("Tu pedido ya esta pagado");
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
