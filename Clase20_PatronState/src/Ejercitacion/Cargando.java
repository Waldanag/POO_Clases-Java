package Ejercitacion;

public class Cargando implements Estado{
    private Carrito c;

    public Cargando(Carrito c) {
        System.out.println("Estoy cargando productos");
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        c.getProductos().add(producto);
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
